package by.bsuir.lab1.classes_and_objects.task15_16;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book)
            return title == ((Book) obj).title && author == ((Book) obj).author && price == ((Book) obj).price;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, Price: %d, Edition: %d", title, author, price, edition);
    }

    @Override
    public Book clone() {
        Book book = new Book();
        book.author = this.author;
        book.price = this.price;
        book.title = this.title;
        return book;
    }

    public int compareTo(Book book) {
        if (this.isbn > book.isbn)
            return 1;
        else if (this.isbn < book.isbn)
            return -1;
        else
            return 0;
    }

    public static Comparator<Book> byAuthor = (book1, book2) -> {
        return book1.author.compareToIgnoreCase(book2.author);
    };

    public static Comparator<Book> byTitle = (book1, book2) -> {
        return book1.title.compareToIgnoreCase(book2.title);
    };

    public static Comparator<Book> byPrice = Comparator.comparingInt(book -> book.price);

    public static Comparator<Book> byTitleThanAuthor = byTitle.thenComparing(byAuthor);
    public static Comparator<Book> byAuthorThanTitle = byAuthor.thenComparing(byTitle);
    public static Comparator<Book> byAuthorThanTitleThanPrice = byAuthor.thenComparing(byTitle).thenComparing(byPrice);
}
