package ru.job4j.todo.service;

import lombok.AllArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import ru.job4j.todo.filter.FilterOptions;
import ru.job4j.todo.model.Item;
import ru.job4j.todo.repository.ItemRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

@Service
@ThreadSafe
@AllArgsConstructor
public class ItemService {

    private final ItemRepository item;

    public void create(Item item, String timeZone) {
        this.item.create(item, timeZone);
    }

    public List<Item> findAllByFilter(FilterOptions filter) {
        Predicate<Item> condition = switch (filter) {
            case NEW -> item -> !item.isDone();
            case DONE -> Item::isDone;
            default -> item -> true;
        };
        return this.item.findAll().stream().filter(condition).distinct().toList();
    }

    public Item findById(int id) {
        return this.item.findById(id);
    }

    public void update(Item item) {
        this.item.update(item);
    }

    public void delete(int id) {
        this.item.delete(id);
    }
}