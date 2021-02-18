package Entities;

import java.util.ArrayList;
import java.util.List;

public class Card {

    private List<Book> bookList = new ArrayList<>();

    private Student student;

    private int id;

    public Card(List<Book> bookList, Student student, int id) {
        this.bookList = bookList;
        this.student = student;
        this.id = id;
    }

    public Card() {

    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String bl = "";
        for (Book book: bookList) {
            bl += book.toString() + ", ";
        }
        return "Card{ id =" + id + " | " +
                "bookList=" +
                bl
                + student.toString() +
                 +
                '}';
    }
}
