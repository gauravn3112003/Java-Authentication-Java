package UserAuthentication.RegisterLogin;

import java.util.Scanner;

public class Login {
  public String user, Password;
  Scanner s = new Scanner(System.in);
  public void getUser(){
    System.out.print("Enter the Username : ");
    user = s.nextLine();
    System.out.print("Enter the Password : ");
    Password = s.nextLine();
    System.out.println();
  }
}
