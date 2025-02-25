public class Library {
  public static int totalBooks = 0;
  public int bookId;
  public String bookName;
  public boolean isIssued;

    public Library(int bookId, String bookName) {
      this.bookId = bookId;
      this.bookName = bookName;
      this.isIssued = false;
    }
    public static void addBooks(int count) {
      totalBooks += count;
      System.out.println(count + " books added. Total books: " + totalBooks);
  }

  public void issueBook() {
      if (!isIssued) {
          isIssued = true;
          totalBooks--; 
          System.out.println(bookName + " has been issued.");
      } else {
          System.out.println(bookName + " is already issued.");
      }
  }

  public void returnBook() {
      if (isIssued) {
          isIssued = false;
          totalBooks++; 
          System.out.println(bookName + " has been returned.");
      } else {
          System.out.println(bookName + " was not issued.");
      }
  }

  public static void displayTotalBooks() {
      System.out.println("Total books available: " + totalBooks);
  }

  public static void main(String[] args) {
      Library.addBooks(5);

      Library book1 = new Library(1, "Java Programming");
      Library book2 = new Library(2, "Data Structures");

      book1.issueBook();
      Library.displayTotalBooks();

      book2.issueBook();
      Library.displayTotalBooks();

      book1.returnBook();
      Library.displayTotalBooks();

      book2.returnBook();
      Library.displayTotalBooks();
  }
}