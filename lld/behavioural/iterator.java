public interface Agrerator {
    public Iterator createIterator();
}


public interface Iterator {
    public boolean hasNext();
    public Object next();
}


public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public Iterator createIterator() {
        return new BookIterator(this);
    }

}

public class BookIterator implements Iterator {
    private List<Book> books;
    private int current = 0;

    BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return current < books.size();
    }

    @Override
    public Object next() {
        return this.hasNext()? books.get(current++) : null;
    }
}


public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}


public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "Author1"));
        books.add(new Book("Book2", "Author2"));
        books.add(new Book("Book3", "Author3"));
        books.add(new Book("Book4", "Author4"));
        books.add(new Book("Book5", "Author5"));

        Library library = new Library(books);
        Iterator iterator = library.createIterator();
        while(iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Book Name: " + book.getName() + " Author: " + book.getAuthor());
        }
    }
} 