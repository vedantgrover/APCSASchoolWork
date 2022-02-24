package ChildrensBookLibrary;

import java.util.ArrayList;

public class LibSearch {

    public static void byAuthor(ArrayList<Book> books, String authorName) {
        boolean found = false;
        for (Book boo : books) {
            if (boo.getAuthor().equals(authorName)) {
                found = true;
                System.out.println("Title: " + boo.getTitle() + " <::> Author: " + boo.getAuthor() + " <::> Rating: "
                        + boo.getRating());
            }
        }

        if (!found) {
            System.out.println("Author not found");
        }
    }

    public static void byRating(ArrayList<Book> books, double rating) {
        for (Book boo : books) {
            if (boo.getRating() >= rating) {
                System.out.println("Title: " + boo.getTitle() + " <::> Author: " + boo.getAuthor() + " <::> Rating: "
                        + boo.getRating());
            }
        }
    }

    public static void betterRating(ArrayList<Book> books, Book book) {
        for (Book boo : books) {
            if (boo.getRating() >= book.getRating()) {
                System.out.println("Title: " + boo.getTitle() + " <::> Author: " + boo.getAuthor() + " <::> Rating: "
                        + boo.getRating());
            }
        }
    }

}
