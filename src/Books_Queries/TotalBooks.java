package Books_Queries;

import Template.*;

public class TotalBooks extends AddBooks {
  AddBooks[] B1 = new AddBooks[100];
  int book = 0;

  public void add_Books() {
    System.out.println("********** ADD BOOKS NOW **********");
    book = book + 1;
    B1[book] = new AddBooks();
    B1[book].add_Books();
    System.out.println("Successfully Added ");
  }
  public void display_Books() {
    System.out.println("********** ALL BOOKS **********");
    if (book == 0) {
      System.out.println("Empty Library !");
    } else {
      for (int i = 1; i < book; i++) {
        B1[i].displayBook();
        System.out.println();
      }
    }

  }

}
