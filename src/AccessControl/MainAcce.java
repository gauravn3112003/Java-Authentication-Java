
package AccessControl;
import java.util.Scanner;
public class MainAcce{
   public void start(){
    Scanner sc = new Scanner(System.in);
    int choice;
    auth A1 = new auth();
    do {
      System.out.println("********** USER AUTHENTICATION SYSTEM **********");
      System.out.println("\n1. USER LOGIN \n2. ADMIN LOGIN \n3. EXIT");
      System.out.print("Enter the choice : ");
      choice = sc.nextInt();
      System.out.println();
      sc.nextLine();
      System.out.println();
      switch (choice) {
        case 1:
          A1.userLogin();
          break;
        case 2:
          A1.adminLogin();
          break;
        case 3:
          System.out.println();
          break;
        default:
          System.out.println("Inavlid Selection");
      }
    } while (choice != 3);

   }
}
