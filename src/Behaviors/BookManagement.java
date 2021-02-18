package Behaviors;

import Entities.Book;

import java.util.ArrayList;

public class BookManagement {
    ArrayList<Book> books = new ArrayList<Book>();

    public void add(Book book){
        books.add(book);
    }

    public void updateBook(Book book){
        for (Book bookUpdate: books) {
            if(book.getId() == bookUpdate.getId()){
                bookUpdate.setName(book.getName());
                bookUpdate.setId(book.getId());
            }
        }
    }

    public void showListBooks(){
        for (Book book: books) {
            System.out.println(book.toString());
        }
    }

    public Book searchBookById(int id){
        Book b = null;
        for (Book book: books) {
            if(book.getId() == id){
                b = book;
            }
        }
        return b;
    }

    public void removeById(int id){
        for (Book book:books) {
            if(book.getId() == id){
                books.remove(book);
            }
        }
    }
}
