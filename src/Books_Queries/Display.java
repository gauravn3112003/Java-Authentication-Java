package Books_Queries;
public class Display {

  public void displayBooks() {
    System.out.println("********** ALL BOOKS **********");
    TotalBooks m1 = new TotalBooks();
    for (int i = 1; i <m1.book ; i++) {
      m1.B1[i].displayBook();
      System.out.println();
    }
  }
}
