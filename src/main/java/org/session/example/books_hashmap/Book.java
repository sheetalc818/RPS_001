package org.session.example.books_hashmap;

public class Book {
    int id;
    String bookName,bookAuthor,bookPublisher;
    int quantity;

    public Book(int id, String bookName, String bookAuthor, String bookPublisher, int quantity) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
