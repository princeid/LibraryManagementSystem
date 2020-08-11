import java.util.List;

public class Library {

    private List<Book> bookCatalogue;
    private List<User> borrowersList;
    private Book book;

    public Library(List<Book> bookCatalogue) {
        this.bookCatalogue = bookCatalogue;
    }

    // Increments the book count after adding if the book is already in the library
    public void addBook(Book book, String title, String author) {
        for (Book bk : bookCatalogue) {

            // Checks whether the book to add is already in the library catalogue using the author and book title
            if (bk.getTitle().equals(title) && bk.getAuthor().equals(author)) {
                bk.setCount(1);
                return;
            }
        }
        bookCatalogue.add(book);
        book.setCount(1);
    }

    public void joinQueue(String bookName, User user) {

    }

    public String lendBook(String bookName, User user) {

        for (Book bk : bookCatalogue) {
//            System.out.println("Titles: " + bk.getTitle());
            if (bk.getTitle().equals(bookName)) {
                if (bk.getCount() > 0) {
                    bk.setCount(-1);
                    return "Successful. You have just issued a copy of " + bk.getTitle() + " to " + user.getFirstName();
                }
            }
        }
        return bookName + " is currently out of stock";
    }

    public void returnBook(String name) {

    }

    public List<Book> getBookCatalogue() {
        return bookCatalogue;
    }

    public List<User> getBorrowersList() {
        return borrowersList;
    }

    public void setBookCatalogue(List<Book> bookCatalogue) {
        this.bookCatalogue = bookCatalogue;
    }

    public String showCatalogue() {
        String catalogue = "";
        for (Book bk : bookCatalogue) {
            catalogue += bk.toString() + "\n";
        }

        return catalogue;
    }

}
