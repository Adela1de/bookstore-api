package com.luiz.bookstore.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Category {

    private Integer id;
    @EqualsAndHashCode.Exclude
    private String name;
    @EqualsAndHashCode.Exclude
    private String description;
    @EqualsAndHashCode.Exclude
    private List<Book> books = new ArrayList<>();

    public Category(Integer id, String name, String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
