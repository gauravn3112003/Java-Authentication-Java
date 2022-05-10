package AccessControl;

import AdminControl.*;
import java.util.Scanner;

public class MainAcce {

  Dashboard d = new Dashboard();

  public void start() {
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
      System.out.println("********** USER AUTHENTICATION SYSTEM **********");
      System.out.println("1. LOGIN \n2. ADMIN LOGIN \n3. EXIT");
      System.out.print("Enter the choice : ");
      choice = sc.nextInt();
      System.out.println();
      sc.nextLine();
      System.out.println();
      switch (choice) {
        case 1:
          d.a.userLogin();
          break;
        case 2:
          d.dashboardAdmin();
          break;
        case 3:
          System.out.println();
          break;
        default:
          System.out.println("Inavlid Selection");
      }
    } while (choice != 3);
  }
}
