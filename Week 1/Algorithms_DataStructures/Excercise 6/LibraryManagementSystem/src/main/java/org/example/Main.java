package org.example;

public class Main {

    public static void main(String[] args) {

        Book[] books = new Book[3];

        books[0] = new Book();
        books[0].bookId = 1;
        books[0].title = "C Programming";
        books[0].author = "Dennis Ritchie";

        books[1] = new Book();
        books[1].bookId = 2;
        books[1].title = "Data Structures";
        books[1].author = "Mark Allen";

        books[2] = new Book();
        books[2].bookId = 3;
        books[2].title = "Java Programming";
        books[2].author = "James Gosling";

        Library library = new Library();

        Book linearResult = library.linearSearch(books, "Java Programming");

        if (linearResult != null) {
            System.out.println("Linear Search Found: " + linearResult.title);
        }

        Book binaryResult = library.binarySearch(books, "Java Programming");

        if (binaryResult != null) {
            System.out.println("Binary Search Found: " + binaryResult.title);
        }
    }
}