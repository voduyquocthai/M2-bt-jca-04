package View;

import Entities.Book;
import Entities.Student;

import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);

    public static Student getStudentInfo(){
        System.out.println("-----------------------------");
        System.out.println("Enter student's name: ");
        String name = input.nextLine();
        System.out.println("Enter student's id: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter student's date of birth: ");
        String dob = input.nextLine();
        System.out.println("Enter student's class: ");
        String _class = input.nextLine();
        Student student = new Student(name, id, dob, _class);
        return student;
    };
    public static Book getBookInfo(){
        System.out.println("-------------------------------");
        System.out.println("Enter book's name: ");
        String name = input.nextLine();
        System.out.println("Enter book's id: ");
        int id = Integer.parseInt(input.nextLine());
        Book book = new Book(id, name);
        return book;
    };
}
