package UserAuthentication;

import UserAuthentication.RegisterLogin.Register.MainData.MainData;
import UserAuthentication.RegisterLogin.Register.Register;
import UserAuthentication.RegisterLogin.*;

import java.util.Scanner;

public class auth extends Register {
  int user = 1;
  int logIn = 0;
  Scanner s = new Scanner(System.in);
  public String userAdmin, passwordAdmin;
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
    for (int i = 0; i < 1; i++) {
      u1[user] = new auth();
      u1[user].getData();
      user = user + 1;
    }
  }

  // for Admin Login
  public void adminLogin() {
    L1.getUser();
    if (L1.user.equals(Secure.AdminId) &&
        L1.Password.equals(Secure.AdminPass)) {
      System.out.println("********** All Users **********");
      System.out.println();
      for (int i = 1; i < user; i++) {
        u1[i].display();
        System.out.println();
      }
    } else {
      System.out.println("Invalid Credential");
    }
  }

}
