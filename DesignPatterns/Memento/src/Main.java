public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Nutuk");
        book.setAuthor("Mustafa Kemal ATATÜRK");
        book.setIsbn("12345");

        book.ShowBook();
        Caretaker history = new Caretaker();

        history.setMemento(book.createUndo());

        book.setIsbn("54321");
        book.setTitle("Geometri");

        book.ShowBook();

        book.RestoreFromUndo(history.getMemento());
        book.ShowBook();
    }
}
