package User_Queries;

// import java.lang.*;
import java.util.*;

import MainData.MainData;

public class Register extends MainData {

  Scanner sc = new Scanner(System.in);

  void cPassword() {
    System.out.print("Enter the Password : ");
    tPass = sc.nextLine();
    System.out.print("Enter Conform Password : ");
    cPass = sc.nextLine();
    if (tPass.equals(cPass)) {
      Pass = cPass;
    } else {
      cPassword();
    }
  }

  void checkMail() {
    System.out.print("Enter the E-mail : ");
    eMail = sc.nextLine();
    int index = eMail.indexOf('@');
    if (index == -1 || Character.isDigit(eMail.charAt(0))) {
      System.out.println("Invalid Emial");
      checkMail();
    }
  }

  public void getData() {
    System.out.print("Enter the Name : ");
    Name = sc.nextLine();
    System.out.print("Enter the Username : ");
    uName = sc.nextLine();
    checkMail();
    cPassword();
    System.out.println();
  }

  // for Display Users
  public void display() {
    System.out.println("Name of User : " + Name);
    System.out.println("Username of User : " + uName);
    System.out.println("E-mial of User : " + eMail);
    System.out.println("Password of user : " + Pass);
    System.out.println();
  }

}
