package theme13;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library l1 = new Library("Big", "Almaty");
        Book b1 = new Book(1, "nfgnfgn", "hjjhvj");
        Book b2 =null;
        Book b3=new Book(3,"hchc","vjvjgv");
        Book b4 = new Book(4, "gcgj","ujvj");

            l1.addBook(b1);
            l1.addBook(b2);
            l1.addBook(b3);
            l1.addBook(b4);
            l1.printBook();
    }
}

class Book {
    int id;
    String name;
    String author;
    protected Book(){
        this.id=0;
        this.name=" ";
        this.author=" ";
    }
    protected Book(int id, String name, String author){
        this.id=id;
        this.name=name;
        this.author=author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }public String getData(){
        return ("Id: "+id+" Name: "+name+" author: "+author);
    }
}
class Library {
    String name;
    String city;
    Book books[] = new Book[3];
    int index = 0;

    protected Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook(Book book) {
        try {
            books[index] = book;
            index++;
        }catch (ArrayIndexOutOfBoundsException e){
         System.out.println("The library is full");
        }
    }
    public void printBook(){
        for (int i=0; i<index;i++){
            try {
                System.out.println("Id: "+books[i].id+" Name: "+books[i].name+" Author: "+books[i].author);
            }catch (NullPointerException e){
                System.out.println("The book is empty");
            }

        }
    }
}

