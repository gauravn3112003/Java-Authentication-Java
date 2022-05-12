package AdminControl;

import AccessControl.*;
import Books_Queries.*;
import java.util.*;

public class Dashboard extends TotalBooks {

  Scanner s = new Scanner(System.in);
  public auth a = new auth();

  public void dashboardAdmin() {
    int ch;
    a.L1.getUser();
    if (a.L1.user.equals(a.Secure.AdminId) &&
        a.L1.Password.equals(a.Secure.AdminPass)) {
      do {
        System.out.println();
        System.out.println(
            "1. ADD USER \n2. DISPLAY USERS \n3. ADD BOOKS \n4. DISPLAY BOOK \n5. EXIT");
        System.out.print("Enter the choice : ");
        ch = s.nextInt();

        switch (ch) {
          case 1:
            a.RegisterNow();
            break;
          case 2:
            System.out.println("********** All Users **********");
            for (int i = 1; i < a.user; i++) {
              a.u1[i].display();
              System.out.println();
            }
            break;
          case 3:
            add_Books();
            break;
          case 4:
            display_Books();
            break;
          case 5:
            System.out.println("Thanks you !");
            break;
          default:
            System.out.println("Invalid Selection");
            break;
        }
      } while (ch != 5);
    } else {
      System.out.println("Invalid Credential");
    }
  }
}
