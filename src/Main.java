import UserAuthentication.RegisterLogin.Login;
import UserAuthentication.RegisterLogin.Register.MainData.*;
import UserAuthentication.auth;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int user = 1;
    int logIn = 0;
    Login L1 = new Login();
    auth[] u1 = new auth[100];
    MainData Secure = new MainData();

    int choice;
    do {
      System.out.println("********** USER AUTH SYSTEM **********");
      System.out.println("1. Register \n2. Login \n3. Display User \n4. Exit");
      System.out.print("Enter the choice : ");
      choice = sc.nextInt();
      System.out.println();
      sc.nextLine();
      System.out.println();
      switch (choice) {
        case 1:
          System.out.println("********** Register Now **********");
          System.out.println();
          for (int i = 0; i < 1; i++) {
            u1[user] = new auth();
            u1[user].getData();
          }
          user = user + 1;
          break;
        case 2:
          L1.getUser();
          for (int i = 1; i < user; i++) {
            if (
              L1.user.equals(u1[i].uName) && L1.Password.equals(u1[i].Pass)
            ) {
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
          break;
        case 3:
         L1.getUser();
          if (
            L1.user.equals(Secure.AdminId) &&
            L1.Password.equals(Secure.AdminPass)
          ) {
            System.out.println("********** All Users **********");
            System.out.println();
            for (int i = 1; i < user; i++) {
              u1[i].display();
              System.out.println();
            }
          } else {
            System.out.println("Invalid Credential");
          }
          break;
        case 4:
          System.out.println();
          break;
        default:
          System.out.println("Inavlid Selection");
      }
    } while (choice != 4);

    sc.close();
  }
}
