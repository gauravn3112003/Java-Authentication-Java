package UserAuthentication;

import UserAuthentication.RegisterLogin.*;
import UserAuthentication.RegisterLogin.Register.MainData.MainData;
import UserAuthentication.RegisterLogin.Register.Register;
import java.io.*;
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
      System.out.println("********** Register Now **********");
      System.out.println();
      u1[user] = new auth();
      u1[user].getData();

      // Directory NAme
      String path = "allUsers";
      // To get no. of text files
      int txt = 0, m = 0;
      File noFile = new File(path);
      String list[] = noFile.list();
      for (String nm : list) {
        File ele1 = new File(path + "/" + nm);
        if (ele1.isFile() && list[m].endsWith("txt"))
          txt++;
        // ele1.delete();
        m++;
      }
      int number = txt + 1;
      // To create "allUsers" Directory
      File dirFile = new File(path);
      dirFile.mkdir();

      // To create specific username txt file
      File Obj = new File(
          dirFile + "/" + u1[user].uName + "_" + number + ".txt");
      if (Obj.createNewFile()) {
        System.out.println(
            "File " + Obj.getName() + " is created successfully.");
      } else {
        System.out.println("File is already exist in the directory.");
      }

      FileWriter Writer = new FileWriter(Obj);
      for (int i = 0; i < user; i++) {
        Writer.write("NAME : " + u1[user].Name + "\n");
        Writer.write("USERNAME : " + u1[user].uName + "\n");
        Writer.write("EMAIL : " + u1[user].eMail + "\n");
        Writer.write("PASSWORD : " + u1[user].Pass + "\n");

        Writer.close();
        System.out.println("Successfully written.");
      }
      user = user + 1;
      System.out.println("Total Text files are : " + number);

      // To read txt File
      System.out.println("All user :");

      File display = new File(dirFile + "/" + u1[user-1].uName + "_" + number + ".txt");
      Scanner Reader = new Scanner(display);
      while (Reader.hasNextLine()) {
        String data = Reader.nextLine();
        System.out.println(data);
      }
      System.out.println("text : " + Reader.hasNextLine());
      // for (int i = 1; i <=txt; i++) {
      // Scanner Reader = new Scanner(display);
      // while (Reader.hasNextLine()) {
      // String data = Reader.nextLine();
      // System.out.println(data);
      // System.out.println();
      // }
      // System.out.println("text : "+Reader.hasNextLine());
      // }

    } catch (IOException e) {
      System.out.println("Internal Server Error : " + e);
    } catch (Exception e) {
      System.out.println("Internal Server Error : " + e);
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
    if (L1.user.equals(Secure.AdminId) && L1.Password.equals(Secure.AdminPass)) {
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
