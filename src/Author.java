public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

    public String toString() {
        return nameAuthor + " " + surnameAuthor;
    }

    public boolean equals(Author other) {
        if (this == other) {
            return true;
        }
        return this.toString().equalsIgnoreCase(other.toString());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(toString());
    }
}


