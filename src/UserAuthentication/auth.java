package UserAuthentication;

import UserAuthentication.RegisterLogin.Register.MainData.MainData;
import UserAuthentication.RegisterLogin.Register.Register;
import UserAuthentication.RegisterLogin.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class auth extends Register {
  int user = 1;
  int logIn = 0;
  Scanner s = new Scanner(System.in);
  public String userAdmin, passwordAdmin;
  Login L1 = new Login();
  Register[] u1 = new Register[100];
  MainData Secure = new MainData();

  // for Registration
  public void RegisterNow() {
    try {

      File Obj = new File("allUsers.txt");
      if (Obj.createNewFile()) {
        System.out.println("File " + Obj.getName() + " is created successfully.");
      } else {
        System.out.println("File is already exist in the directory.");
      }

      System.out.println("********** Register Now **********");
      System.out.println();
        u1[user] = new auth();
        u1[user].getData();

        FileWriter Writer = new FileWriter(Obj);
        for (int i = 0; i < user; i++) {
          Writer.write(user + " " + u1[user].Name + "\n");
          Writer.write(user + " " + u1[user].uName + "\n");
          Writer.write(user + " " + u1[user].eMail + "\n");
          Writer.close();
          System.out.println("Successfully written.");
        }
        user = user + 1;
        

    } catch (IOException e) {
      System.out.println("Internal Server Error");
      e.printStackTrace();
    }
  }

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
