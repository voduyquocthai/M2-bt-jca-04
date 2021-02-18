package View;

import Behaviors.BookManagement;
import Behaviors.CardManagement;
import Behaviors.StudentManagement;
import Entities.Book;
import Entities.Card;
import Entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static BookManagement bm = new BookManagement();
    static StudentManagement sm = new StudentManagement();
    static CardManagement cm = new CardManagement();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        startMenu:
        do {
            System.out.println("1. Student Management: ");
            System.out.println("2. Book Management: ");
            System.out.println("3. Card Management: ");
            int choice = Integer.parseInt(input.nextLine());
            if (choice == 1) {
                do {
                    System.out.println("-----Student Management-----");
                    System.out.println("1. Add");
                    System.out.println("2. Delete");
                    System.out.println("3. Update");
                    System.out.println("4. Show All Students");
                    System.out.println("0. Back");
                    int choice2 = 0;
                    try {
                        choice2 = Integer.parseInt(input.nextLine());
                        switch (choice2) {
                            case 1:
                                Student s = Menus.getStudentInfo();
                                sm.addStudent(s);
                                break;
                            case 2:
                                System.out.println("Enter the student's Id that you want to remove: ");
                                int id = Integer.parseInt(input.nextLine());
                                sm.deleteStudentById(id);
                                break;
                            case 3:
                                Student s2 = Menus.getStudentInfo();
                                sm.updateStudent(s2);
                                break;
                            case 4:
                                sm.showListStudent();
                                break;
                            case 0:
                                continue startMenu;
                            default:
                                System.out.println("Try Again !");
                                continue ;
                        }
                    } catch (Exception e) {
                    }
                } while (true);
            } else if(choice == 2){
                do {
                    System.out.println("-----Book Management-----");
                    System.out.println("1. Add");
                    System.out.println("2. Update");
                    System.out.println("3. Delete");
                    System.out.println("4. Show All Books");
                    System.out.println("0. Back");
                    int choice2 = Integer.parseInt(input.nextLine());
                    switch (choice2){
                        case 1:
                            Book book = Menus.getBookInfo();
                            bm.add(book);
                            break ;
                        case 2:
                            Book book2 = Menus.getBookInfo();
                            bm.updateBook(book2);
                            break ;
                        case 3:
                            System.out.println("Enter the book's ID that you want to remove: ");
                            int id = Integer.parseInt(input.nextLine());
                            bm.removeById(id);
                            break ;
                        case 4:
                            bm.showListBooks();
                            break ;
                        case 0:
                            continue startMenu;
                        default:
                            System.out.println("Try again !");
                            continue ;
                    }
                } while (true);
            } else {
                do{System.out.println("-----Card Management-----");
                    System.out.println("1. Add Card");
                    System.out.println("2. Show List Card");
                    System.out.println("0. Back");
                    int choice2 = Integer.parseInt(input.nextLine());
                    switch (choice2){
                        case 1:
                            ArrayList<Book> borrowedBooks = new ArrayList<>();
                            Card card = new Card();
                            System.out.println("Enter Card's Id: ");
                            card.setId(Integer.parseInt(input.nextLine()));
                            System.out.println("Enter Student's Id: ");
                            int studentId = Integer.parseInt(input.nextLine());
                            card.setStudent(sm.searchStudentById(studentId));
                            System.out.println("Enter the quantity of books you want to borrow: ");
                            int quantity = Integer.parseInt(input.nextLine());
                            for(int i = 0; i < quantity; i++){
                                System.out.println("Enter book's Id: ");
                                int bookId = Integer.parseInt(input.nextLine());
                                Book book = bm.searchBookById(bookId);
                                borrowedBooks.add(book);
                            }
                            card.setBookList(borrowedBooks);
                            cm.addCard(card);
                            break ;
                        case 2:
                            cm.showListCard();
                            break ;
                        case 0:
                            continue startMenu;
                        default:
                            System.out.println("Try Again !");
                            continue ;
                    }
                }while (true);
            }
        } while (true);
    }
}
