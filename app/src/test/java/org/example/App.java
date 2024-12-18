package org.example;

public class App {
    public static void main(String[] args) {

        //Object for a book
        Book book1 = new Book("How football is played", "Lionel Adres Messi", 2010);
        Book book2 = new Book("How I try to compete with the god of football", "Cristiano Ronaldo", 2008);
        Book book3 = new Book("1984", "George Orwell", 1949);
        //Object for a Patron
        Patron pt = new Patron("Pep Guardiola", "22020691");

        //Object for the library class
        Library lb = new Library();

        //Add a book to the Library
        lb.addBook(book1);

        //Add Patron to the library
        lb.addPatron(pt);

        System.out.println(lb.findBookByTitle("2008"));
        System.out.println(lb.findBooksByAuthor("Lionel Andres Messi"));


    }
}
