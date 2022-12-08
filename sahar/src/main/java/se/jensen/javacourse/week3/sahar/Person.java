package se.jensen.javacourse.week3.sahar;

import java.time.LocalDate;

public class Person {
    private String name;
    private String email;
    private int id;
    private LocalDate db;

    public Person() {
    }

    public Person(String name, String email, int id, LocalDate db) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.db = db;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDb() {
        return db;
    }
}

