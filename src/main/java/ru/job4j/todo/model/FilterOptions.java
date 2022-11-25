package ru.job4j.todo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FilterOptions {
    ALL("All"), NEW("New"), DONE("Done");

    private String value;
}
