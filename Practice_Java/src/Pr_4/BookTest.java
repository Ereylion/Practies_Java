package Pr_4;

import Pr_4.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Александр Пушкин", "Евгений Онегин", 1833, "Роман в стихах");

        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());
        System.out.println("Жанр: " + book.getGenre());

        book.setYear(1823);
        System.out.println("Измененный год написания: " + book.getYear());
    }
}
