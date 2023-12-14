package Pr_1;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Notes about Sherlock Holmes", "detective");
        Book b2 = new Book("War and Peace", "novel");
        Book b3 = new Book("Lords of Rings");
        b3.setGenre("fantasy");
        b1.takeBook();
        b2.takeBook();
        b3.takeBook();
    }
}
