package Books_Queries;
import Template.*;
public class Add {
  TotalBooks t1 = new TotalBooks();
  public void addBooks() {
    System.out.println("********** ADD BOOKS NOW **********");
    t1.B1[t1.book] = new AddBooks();
    t1.B1[t1.book].add_Books();
    t1.book++;
    System.out.println("Successfully Added ");
  }
}
