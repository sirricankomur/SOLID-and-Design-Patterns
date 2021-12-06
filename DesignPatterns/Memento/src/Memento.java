import java.time.Instant;

public class Memento {
    private String title;
    private String author;
    private String isbn;
    private Instant lastEdited;

    public Memento(String title, String author, String isbn, Instant lastEdited) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.lastEdited = lastEdited;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Instant getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(Instant lastEdited) {
        this.lastEdited = lastEdited;
    }
}
