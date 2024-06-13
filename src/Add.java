public class Add {
    public static void main(String[] args) {
        Author createAuthorOne = new Author("Динозавр", "Пупыркин");
        Author createAuthorTwo = new Author("Пират", "Обормот");
        Book createBookOne = new Book("Как перестать страдать фигней?", createAuthorOne, 2024);
        Book createBookTwo = new Book("Это безумие? Нет! Это JAVA!", createAuthorTwo, 2024);
        createBookTwo.setYear(2021);
        System.out.println(createBookOne);
        System.out.println(createBookTwo);
        // createBookOne.setYear(-1000);
        Author createAuthorTest = new Author("Динозавр", "Пупыркин");
        System.out.println(createAuthorTest.equals(createAuthorOne));
        Book createBookTest = new Book("КАК перестать страдать фигней?", createAuthorTest, 2024);
        System.out.println(createBookTest.equals(createBookOne));
    }
}
