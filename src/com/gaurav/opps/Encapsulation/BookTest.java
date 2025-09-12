package com.gaurav.opps.Encapsulation;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", 2020);
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getPublicationYear());

        try {
            book1.setPublicationYear(2030);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
