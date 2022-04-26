package UserAuthentication.RegisterLogin.Register;

import UserAuthentication.RegisterLogin.Register.MainData.MainData;
// import java.lang.*;
import java.util.*;
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
  
}
