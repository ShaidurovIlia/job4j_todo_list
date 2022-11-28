package ru.job4j.todo.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.todo.filter.FilterOptions;
import ru.job4j.todo.model.User;
import ru.job4j.todo.service.ItemService;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
@AllArgsConstructor
public class IndexController {

    private final ItemService itemService;

    @GetMapping("/index")
    public String index(Model model, HttpSession session) {
        model.addAttribute("items", this.itemService.findAll(FilterOptions.ALL)
                .stream()
                .filter(post -> date(post.getCreated()))
                .toList());
        User user = (User) session.getAttribute("user");
        if (user == null) {
            user = new User();
            user.setName("Guest");
        }
        model.addAttribute("user", user);
        return "index";
    }

    private boolean date(LocalDateTime date) {
        return date.getYear() == LocalDateTime.now().getYear()
                && date.getMonth() == LocalDateTime.now().getMonth()
                && date.getDayOfMonth() == LocalDateTime.now().getDayOfMonth();
    }
}