package moocfihelsinki.bookcollection;

import java.util.ArrayList;
import java.util.Scanner;

import moocfihelsinki.bookcollection.book.Book;

public class BookCollection {
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Scanner reader){
        reader.nextLine(); // fix user input being ignored
        System.out.println("Add book name: ");
        var title = reader.nextLine();
        System.out.println("Add number of pages: ");
        var numPages = reader.nextInt();
        System.out.println("Add publication year");
        var pubYear = reader.nextInt();
        bookList.add(new Book(title, numPages, pubYear));
    }

    public void printBooks(Scanner reader){
        reader.nextLine();
        System.out.println("What details should be printed? ");
        System.out.println("Type \"everything\" for printing all the details");
        System.out.println("Type \"name\" for only the book name to be printed");
        switch (reader.nextLine()) {
            case "everything":
                bookList.forEach((book) -> {
                    System.out.println(book.getTitle() + " , " + book.getPages() + (book.getPages() == 1? " page " : " pages ") + book.getPublicationYear());
                });
                break;
            case "name":
                bookList.forEach((book) -> {
                    System.out.println(book.getTitle());
                });
                break;
            default:
                break;
        }
    }
}
