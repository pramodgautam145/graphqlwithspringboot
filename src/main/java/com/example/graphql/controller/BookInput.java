package com.example.graphql.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookInput {
    private String title;
    private String desc;
    private String name;
    private String author;
    private double price;
    private int page;
}
