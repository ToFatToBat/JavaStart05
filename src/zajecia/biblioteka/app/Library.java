package zajecia.biblioteka.app;

import zajecia.biblioteka.model.Book;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("ABC", "Autor", 1234566);

        System.out.println(book.toString());
    }
}
