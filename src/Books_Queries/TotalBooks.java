package Books_Queries;

import Template.*;

public class TotalBooks extends AddBooks{

  public AddBooks[] B1 = new AddBooks[100];
  public int book = 1;

  // For adding Books
  public void add_Books() {
    System.out.println("********** ADD BOOKS NOW **********");
    B1[book] = new AddBooks();
    B1[book].add_Books();
    book++;
    System.out.println("Successfully Added ");
  }
  
  // for displays Books
  public void displayBoo() {
    System.out.println("************* All BOOKS *************");
    for (int i = 1; i <= book; i++) {
      B1[i].displayBook();
      System.out.println();
    }
  }
}
