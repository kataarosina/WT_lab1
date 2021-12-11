package by.bsuir.lab1.classes_and_objects.task12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

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
}
