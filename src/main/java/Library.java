import java.util.*;

public class Library {

    private List<Book> bookCatalogue;
//    private List<User> borrowersList;
    Map<User, String> bookRequest = new HashMap<>();
    Queue<User> normalQueue = new LinkedList<>();
    private Book book;

    public Library(List<Book> bookCatalogue) {
        this.bookCatalogue = bookCatalogue;
    }

    // Increments the book count after adding if the book is already in the library
    public String addBook(Book book, String title, String author) {
        for (Book bk : bookCatalogue) {

            // Checks whether the book to add is already in the library catalogue using the author and book title
            if (bk.getTitle().equals(title) && bk.getAuthor().equals(author)) {
                bk.setCount(1);
                return "Successful. There're now " + bk.getCount() + " copies of '" + title + "' in the library.";
            }
        }
        bookCatalogue.add(book);
        book.setCount(1);
        return "Successful. There're now 1 copy of '" + title + "' in the library.";
    }

    public String lendBookImplementation1(String bookName) {

        PriorityQueue<User> borrowersQueue = new PriorityQueue<>(normalQueue);

        System.out.println("Normal: " + normalQueue);
        System.out.println("bor: " + borrowersQueue);
        System.out.println("Normal head: " + normalQueue.peek());
        System.out.println("Bor head: " + borrowersQueue.peek());
        System.out.println("Bor head: " + borrowersQueue.peek());
        System.out.println("Bor head: " + borrowersQueue.peek());
        System.out.println("Bor head: " + borrowersQueue.peek());

        String name = borrowersQueue.peek().getFirstName();
        System.out.println("NAME: " + name);

        for (Book bk : bookCatalogue) {
            if (bk.getTitle().equals(bookName)) {
                if (bk.getCount() > 0) {
                    bk.setCount(-1);
                    return "You have just issued a copy of " + bk.getTitle() + " to " + borrowersQueue.peek().getFirstName();
                }
            }
        }
        return "Book Taken";
    }

    public String lendBookImplementation2(String bookName) {

        for (Book bk : bookCatalogue) {
            if (bk.getTitle().equals(bookName)) {
                if (bk.getCount() > 0) {
                    bk.setCount(-1);
                    return "You have just issued a copy of " + bk.getTitle() + " to " + normalQueue.peek().getFirstName();
                }
            }
        }
        return "Book Taken";
    }


    public List<Book> getBookCatalogue() {
        return bookCatalogue;
    }

    public String showCatalogue() {
        String catalogue = "";
        for (Book bk : bookCatalogue) {
            catalogue += bk.toString() + "\n";
        }

        return catalogue;
    }

}
