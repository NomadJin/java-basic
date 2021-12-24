package objectex;

import java.util.StringJoiner;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("title='" + title + "'")
                .add("author='" + author + "'")
                .toString();
    }
}

public class ToStringTest {
    public static void main(String[] args) {
        Book book = new Book("토지", "박경리");

        System.out.println(book);
    }
}
