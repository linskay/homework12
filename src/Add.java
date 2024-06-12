public class Add {
    public static void main(String[] args) {
        Author createAuthorOne = new Author("Динозавр", "Пупыркин");
        // System.out.println(createAuthorOne.getNameAuthor() + " " + createAuthorOne.getSurnameAuthor());
        Author createAuthorTwo = new Author("Пират", "Обормот");
        // System.out.println(createAuthorTwo.getNameAuthor() + " " + createAuthorTwo.getSurnameAuthor());
        Book createBookOne = new Book("Как перестать страдать фигней?", createAuthorOne, 2024);
        // System.out.println(createBookOne.getNameBook() + " " + createBookOne.getWriter().getNameAuthor() + " " + createBookOne.getWriter().getSurnameAuthor() + ", " + createBookOne.getYear());
        Book createBookTwo = new Book("Это безумие? Нет! Это JAVA!", createAuthorTwo, 2024);
        // System.out.println(createBookTwo.getNameBook() + " " + createBookTwo.getWriter().getNameAuthor() + " " + createBookTwo.getWriter().getSurnameAuthor() + ", " + createBookTwo.getYear());
        createBookTwo.setYear(2021);
        //  System.out.println(createBookTwo.getNameBook() + " " + createBookTwo.getWriter().getNameAuthor() + " " + createBookTwo.getWriter().getSurnameAuthor() + ", " + createBookTwo.getYear());
        System.out.println(createBookOne);
        System.out.println(createBookTwo);
    }
}
