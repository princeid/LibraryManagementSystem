public class Book{
    private String isbn;
    private String title;
    private String author;
    private int price;
    private String genre;
    private int count;

    public Book(String isbn, String title, String author, int price, String genre, int count) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.count = count;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\n" + "Author: " + this.author + "\n" + "Genre: " +
                this.genre + "\n" + "Available: " + this.count + "\n";
    }
}
