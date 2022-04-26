package UserAuthentication;

import UserAuthentication.RegisterLogin.Register.MainData.MainData;
import UserAuthentication.RegisterLogin.Register.Register;
import UserAuthentication.RegisterLogin.Login;

import java.util.Scanner;

public class auth extends Register {
  int user = 1;
  
    int logIn = 0;
  Scanner s = new Scanner(System.in);
  public String userAdmin, passwordAdmin;
  Login L1 = new Login();
  auth[] u1 = new auth[100];
  MainData Secure = new MainData();

  // for Display Users
  public void display() {
    System.out.println("Name of User : " + Name);
    System.out.println("Username of User : " + uName);
    System.out.println("E-mial of User : " + eMail);
    System.out.println("Password of user : " + Pass);
    System.out.println();
  }

  // for User Login
  void userLogin() {
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
  void RegisterNow() {
    System.out.println("********** Register Now **********");
    System.out.println();
    for (int i = 0; i < 1; i++) {
      u1[user] = new auth();
      u1[user].getData();
      user = user + 1;
    }
  }

  // for Admin Login
  void adminLogin() {
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
