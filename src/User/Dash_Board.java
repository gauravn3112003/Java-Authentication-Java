package User;

import java.util.*;
import Books_Queries.*;

public class Dash_Board extends TotalBooks {
  int ch;
  Scanner sc = new Scanner(System.in);
  public void userDashboard() {
    do {
      System.out.println(
          "1. VIEW BOOKS \n2. ISSUE BOOK \n3. RETURN BOOK \n4. EXIT ");
      System.out.print("Enter the choice : ");
      ch = sc.nextInt();
      switch (ch) {
        case 1:
          display_Books();
          break;
        case 2:
          System.out.println("Issue books...");
          break;
        case 3:
          System.out.println("Return Books...");
          break;
        case 4:
          System.out.println("Exit");
          break;
        default:
          System.out.println("Invalid selection");
          break;
      }
    } while (ch != 4);
  }
}
