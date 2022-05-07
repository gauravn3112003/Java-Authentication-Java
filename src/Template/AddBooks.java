package Template;
import java.util.*;

import MainData.*;
public class AddBooks {
    MainData m1 = new MainData();
    Date d1 = new Date();
    Scanner sc = new Scanner(System.in);
    public void addBooks(){
        System.out.println();
        System.out.print("Enter the Book Name : ");
        m1.bookName = sc.nextLine();
        System.out.print("Enter the Author : ");
        m1.author = sc.nextLine();
        m1.date = d1.toString();
    }

    public void displayBook(){
        System.out.println("Name of Books : " + m1.bookName);
    System.out.println("Name of Author : " +  m1.author);
    System.out.println("Date of Adding Book : " +  m1.date);
    System.out.println();
    }
}
