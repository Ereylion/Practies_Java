package Pr_1;

import java.lang.*;
public class Book {
    private String name;
    private String genre;
    public Book (String n, String a){
        name = n;
        genre = a;
    }
    public Book (String n){
        name = n;
        genre = "fantasy";
    }
    public Book (){
        name = "The Way of Kings";
        genre = "fantasy";
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public String getGenre(String genre) {
        return genre;
    }
    public void takeBook(){
        System.out.println("You took a book called "+ name +", genre "+ genre);
    }
}
