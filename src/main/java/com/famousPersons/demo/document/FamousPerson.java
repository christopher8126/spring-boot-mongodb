package com.famousPersons.demo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "famousPerson")
public class FamousPerson {


    @Id
    private String id;

    private final String name;
    private final String bio;
    private final String date;

    public FamousPerson(String name, String bio, String date) {
        this.name = name;
        this.bio = bio;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}
