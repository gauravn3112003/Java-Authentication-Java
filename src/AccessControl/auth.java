package AccessControl;
import MainData.*;
import Template.*;
import User.*;
import java.util.Scanner;

public class auth extends Dash_Board {

  public int user = 1;
  int logIn = 0;
  Scanner s = new Scanner(System.in);
  AddBooks a1 = new AddBooks();
  int ch;
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
    if (logIn == 1) {
      System.out.println("Login Successfull");
      System.out.println();
      userDashboard();
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
