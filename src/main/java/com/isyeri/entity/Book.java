package com.isyeri.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.NaturalId;


public class Book {

    private Long id;
    private String isbn;
    private String myJsonField;

    //Getters and setters omitted for brevity
}