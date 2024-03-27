package inheritance;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class BookConstructor {
    private String name;
    private String isbn;
    private String publisher;
    private int noOfPages;
    private String author;
    private String genre;
    private int edition;

    public BookConstructor(String name, String isbn, String publihser,
                           int noOfPages, String author, String genre,
                           int edition)
    {
        this.name = name;
        this.isbn = isbn;
        this.publisher = publihser;
        this.noOfPages = noOfPages;
        this.author = author;
        this.genre = genre;
        this.edition = edition;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}

public class BookConstructorDemo {
    static Scanner sc = new Scanner(System.in);
    List<BookConstructor> bookList = new ArrayList<>();

    public static void main (String[] args) {

        BookConstructorDemo bcd = new BookConstructorDemo();

        while(true) {
            try {
                System.out.println("1. Add books. \n2.Show Books. \n3.Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: bcd.addBook(); break;
                    case 2: bcd.printBooks(); break;
                    case 3: System.exit(0);
                    default: System.out.println("Invalid choice. Try again."); break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid choice.");
            }
        }
    }

    public void addBook() {
        sc.nextLine();
        System.out.print("Enter book name: ");
        String bookName = sc.nextLine();
        System.out.print("Enter isbn: ");
        String isbn = sc.nextLine();
        System.out.print("Enter the name of the publishing house: ");
        String publisher = sc.nextLine();
        System.out.print("Enter the number of pages the book has: ");
        int noOfPages = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the author name: ");
        String author = sc.nextLine();
        System.out.print("Enter the genre of the book: ");
        String genre = sc.nextLine();
        System.out.print("Enter the editon of the book: ");
        int edition = sc.nextInt();

        BookConstructor book = new BookConstructor(bookName, isbn, publisher,
                noOfPages, author, genre, edition);

        bookList.add(book);
    }

    public void printBooks() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Book added in the list so far:- ");
        for(BookConstructor book : bookList) {
            System.out.println(book.getName() + " Written by " + book.getAuthor());
        }
        System.out.println("-----------------------------------------------------");
    }

}


