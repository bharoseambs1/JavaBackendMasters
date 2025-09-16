package com.satish.oopsconcept.encapsulaas;

import java.time.Year;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if(publicationYear <= Year.now().getValue()){
            this.publicationYear = publicationYear;
        }else{
            System.out.println("future publication year not allowed.");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
