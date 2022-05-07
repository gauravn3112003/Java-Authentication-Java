package Books_Queries;
import Template.AddBooks;
public class Add {
  TotalBooks t1 = new TotalBooks();
  public void add_Books() {
    System.out.println("********** ADD BOOKS NOW **********");
    t1.B1[t1.book] = new AddBooks();
    t1.B1[t1.book].addBooks();
    t1.book++;
    System.out.println("Successfully Added ");
  }
}
