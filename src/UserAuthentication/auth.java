package UserAuthentication;

// import UserAuthentication.RegisterLogin.Register.MainData.*;
import UserAuthentication.RegisterLogin.Register.Register;
import java.util.Scanner;

public class auth extends Register {

  Scanner s = new Scanner(System.in);

  public String userAdmin, passwordAdmin;

  public void display() {
    System.out.println("Name of User : " + Name);
    System.out.println("Username of User : " + uName);
    System.out.println("E-mial of User : " + eMail);
    System.out.println("Password of user : " + Pass);
    System.out.println();
  }

}
