package AccessControl;

import Books_Queries.*;
import MainData.*;
import Template.*;
import java.util.Scanner;

public class auth {

  int user = 1;
  int logIn = 0;
  Scanner s = new Scanner(System.in);
  public String userAdmin, passwordAdmin;
  Add a1 = new Add();
  Display d1 = new Display();
  Login L1 = new Login();
  Register[] u1 = new Register[100];
  MainData Secure = new MainData();

  // for User Login
  public void userLogin() {
    L1.getUser();
    for (int i = 1; i < user; i++) {
      if (L1.user.equals(u1[i].uName) && L1.Password.equals(u1[i].Pass)) {
        logIn = 1;
        break;
      } else {
        logIn = 0;
      }
    }
    if (logIn == 1) {
      System.out.println("Login Successfull");
    } else {
      System.out.println("Invalid Credential");
    }
  }

  // for Registration
  public void RegisterNow() {
    System.out.println("********** Register Now **********");
    System.out.println();
    u1[user] = new Register();
    u1[user].getData();
    user = user + 1;
  }

  // for Admin Login
  public void adminLogin() {
    int ch;
    L1.getUser();
    if (
      L1.user.equals(Secure.AdminId) && L1.Password.equals(Secure.AdminPass)
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
            RegisterNow();
            break;
          case 2:
            System.out.println("********** All Users **********");

            for (int i = 1; i < user; i++) {
              u1[i].display();
              System.out.println();
            }
          case 3:
            a1.add_Books();
            break;
          case 4:
            d1.DisplayBooks();
            break;
          case 5:
            System.out.println("Thanks you !");
            break;
          default:
            System.out.println("Invalid Selectiojn");
            break;
        }
      } while (ch != 5);
    } else {
      System.out.println("Invalid Credential");
    }
  }
}
