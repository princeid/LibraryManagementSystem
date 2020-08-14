import java.util.*;

public class Library {

    private List<Book> bookCatalogue;

    public Queue<User> normalQueue = new LinkedList<>();

    public Library(List<Book> bookCatalogue) {
        this.bookCatalogue = bookCatalogue;
    }

    /**
     *
     * @param book An object of Book class
     * @param title the title of the boook to add
     * @param author the author of the book to add
     * @return
     */
    public String addBook(Book book, String title, String author) {
        for (Book bk : bookCatalogue) {

            /* Checks whether the book to add is already in the library catalogue using the author and book title,
            and if it is then the count is incremented by 1. Otherwise add the book to the library and set the count to 1. */
            if (bk.getTitle().equals(title) && bk.getAuthor().equals(author)) {
                bk.setCount(1);
                return "Successful. There're now " + bk.getCount() + " copies of '" + title + "' in the library.";
            }
        }
        bookCatalogue.add(book);
        book.setCount(1);
        return "Successful. There're now 1 copy of '" + title + "' in the library.";
    }

    /**
     *  First Implementation: The books are given by the Librarian based on priority
     * @param bookName The name of the book to borrow
     * @return
     */
    public String lendBookImplementation1(String bookName) {
    // The Priority Queue is used to store the order in which to assign a book based on the borrowers level
        Queue<User> borrowersQueue = new PriorityQueue<>(normalQueue);

        /* Traversing through the book catalogue to check whether the book the user is requesting for is in the library and how many
        copies are left. */
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

    /**
     *  First Implementation: The books are given by the Librarian on a first come first serve basis
     * @param bookName The name of the book to borrow
     * @return
     */
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

    /* Returns the String format of the book catalogue. */
    public String showCatalogue() {
        String catalogue = "";
        for (Book bk : bookCatalogue) {
            catalogue += bk.toString() + "\n";
        }

        return catalogue;
    }
}