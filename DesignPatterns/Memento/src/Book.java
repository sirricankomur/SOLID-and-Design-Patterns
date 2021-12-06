import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Date;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private Instant lastEdited;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        setLastEdited();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        setLastEdited();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
        setLastEdited();
    }

    public Instant getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited() {
        lastEdited = Instant.now();
    }

    public Memento createUndo() {
        return new Memento(title, author, isbn, lastEdited);
    }

    public void RestoreFromUndo(Memento memento) {
        title = memento.getTitle();
        author = memento.getAuthor();
        isbn = memento.getIsbn();
        lastEdited = memento.getLastEdited();
    }

    public void ShowBook() {
        System.out.println(isbn + " - " + title + " - " + author + " - " + lastEdited);
    }
}
