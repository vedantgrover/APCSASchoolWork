package ChildrensBookLibrary;

import java.util.ArrayList;

public class LibraryRunner {
  public static void main(String[] arg) {
    // Your testing code to be implemented here //
    Library library = new Library();

    ArrayList<Book> libArrList = library.getChildrensBooks();
    LibSearch.byAuthor(libArrList, "Frances Hodgson Burnett");
    System.out.println();;
    LibSearch.byRating(libArrList, 4.2);
    System.out.println();
    LibSearch.betterRating(libArrList, libArrList.get(18));
  }
}