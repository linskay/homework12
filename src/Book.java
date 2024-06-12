public class Book {
    private String nameBook;
    private Author writer;
    private int year;

    public Book(String nameBook, Author writer, int year) {
        this.nameBook = nameBook;
        this.writer = writer;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getWriter() {
        return this.writer;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
