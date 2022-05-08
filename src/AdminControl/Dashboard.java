package AdminControl;

import AccessControl.*;
import Books_Queries.*;
// import MainData.*;
// import Template.*;
import java.util.*;

public class Dashboard {
    Scanner s = new Scanner(System.in);

  public auth a = new auth();
  TotalBooks t1 = new TotalBooks();

  public void dashboardAdmin() {
    int ch;
    a.L1.getUser();
    if (
      a.L1.user.equals(a.Secure.AdminId) &&
      a.L1.Password.equals(a.Secure.AdminPass)
    ) {
      do {
        System.out.println();
        System.out.println(
          "1. ADD USER \n2. DISPLAY USERS \n3. ADD BOOKS \n4. DISPLAY BOOK \n5. EXIT"
        );
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
            t1.add_Books();
            break;
          case 4:
            System.out.println("********** All BOOKS **********");
            for (int i = 1; i < t1.book; i++) {
              t1.B1[i].displayBook();
              System.out.println();
            }

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
