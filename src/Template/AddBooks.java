package Template;

import MainData.*;
import java.util.*;

public class AddBooks extends MainData {

  Date d1 = new Date();
  Scanner sc = new Scanner(System.in);
  public void add_Books() {
    System.out.println();
    System.out.print("Enter the Book Name : ");
    bookName = sc.nextLine();
    System.out.print("Enter the Author : ");
    author = sc.nextLine();
    // date = d1.toString();
  }

  public void displayBook() {
    System.out.println("Name of Books : " + bookName);
    System.out.println("Name of Author : " + author);
    // System.out.println("Date of Adding Book : " + date);
    System.out.println();
  }
}
