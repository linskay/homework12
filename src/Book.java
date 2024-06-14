import java.util.Objects;

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
        if (year < 0) {
            throw new IllegalArgumentException("Год не может быть отрицательным");
        }
        this.year = year;
    }

    public String toString() {
        return getNameBook() + ", " + getYear() + " | " + getWriter();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameBook.equals(book.nameBook) &&
                Objects.equals(writer, book.writer) &&
                Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, writer, year);
    }
}
