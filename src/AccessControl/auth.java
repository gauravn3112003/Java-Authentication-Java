package AccessControl;

import Books_Queries.*;
import MainData.*;
import Template.*;
import User.*;
import java.util.Scanner;

public class auth extends Dash_Board {

  public int user = 1;
  int logIn = 0;
  Scanner s = new Scanner(System.in);
  Display d1 = new Display();
  AddBooks a1 = new AddBooks();
  int ch ;
  public Login L1 = new Login();
  public Register[] u1 = new Register[100];
  public MainData Secure = new MainData();

  // Dash_Board dash = new Dash_Board();

  // for User Login
  public void userLogin() {
    L1.getUser();
    for (int i = 1; i < user; i++) {
      if (L1.user.equals(u1[i].uName) && L1.Password.equals(u1[i].Pass)) {
        logIn = 1;
      } else {
        logIn = 0;
      }
    }
    if (logIn == 0) {
      System.out.println("Login Successfull");
      System.out.println(
        "1. VIEW BOOKS \n2. ISSUE BOOK \n3. RETURN BOOK \n4. EXIT "
      );
      System.out.print("Enter the choice : ");
      ch = s.nextInt();
     
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
    System.out.println("Successfully Register !");
  }
}
