package by.savik.L03_02_2025;

public class LibraryWork {
    public static void main(String[] args) {

        Library library = new Library(6);

        Author tolkien = new Author("Джон", "Толкин", 1892);
        Author tolstoy = new Author("Лев", "Толстой", 1828);
        Author azimov = new Author("Айзек", "Азимов", 1920);

        Book lordOfTheRings = new Book("Властелин колец", tolkien, 1955);
        Book silmarillion = new Book("Сильмариллион", tolkien, 1977);
        Book warAndPeace = new Book("Война и мир", tolstoy, 1867);
        Book annaKarenina = new Book("Анна Каренина", tolstoy, 1878);
        Book foundation = new Book("Основание", azimov, 1951);
        Book robot = new Book("Я, робот", azimov, 1951);
        EBook hobbit = new EBook("Хоббит", tolkien, 1965, 50);

        System.out.println(hobbit.getDescription());

        /*library.addBook(lordOfTheRings);
        library.addBook(silmarillion);
        library.addBook(warAndPeace);
        library.addBook(annaKarenina);
        library.addBook(foundation);
        library.addBook(robot);

        System.out.println("Все книги");
        library.showBookList();

        System.out.println("Поиск книги 'Властелин колец':");
        System.out.println(library.searchBook("Властелин колец"));

        System.out.println("Книги после сортировки по году издания:");
        library.sortByYear();
        library.showBookList();

        System.out.println("Книги после сортировки по году рождения автора:");
        library.sortByBirthYear();
        library.showBookList();*/

    }
}
