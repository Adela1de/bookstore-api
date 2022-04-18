package com.luiz.bookstore.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Integer id;
    @EqualsAndHashCode.Exclude
    private String title;
    @EqualsAndHashCode.Exclude
    private String authorName;
    @EqualsAndHashCode.Exclude
    private String Text;
    @EqualsAndHashCode.Exclude
    private Category category;
}
