package org.sahar;

public class Book extends Library {
    private String title;
    private String author;

    //Constructor 1
    public Book(){
        this("title","author");
    }
    public Book(String title, String author){
        this.title= title;
        this.author= author;
    }
    //Constructor 2
    public Book(String title){
        this(title, "author");
    }
//getter author
    public String getAuthor() {
        return author;
    }
//setter author
    public void setAuthor(String author) {
        this.author = author;
    }
//getter title
    public String getTitle() {
        return title;
    }
//setter title
    public Book setTitle(String title) {
        this.title = title;
        return null;
    }
    //creates new book objects

    public static Book createBook(String title,String author){
        return new Book(title,author);
    }
}

