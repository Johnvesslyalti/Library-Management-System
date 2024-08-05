package johnvesslyalti;

//Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
 private List<Book> books;
 private List<Member> members;

 public Library() {
     books = new ArrayList<>();
     members = new ArrayList<>();
 }

 public void addBook(Book book) {
     books.add(book);
 }

 public void addMember(Member member) {
     members.add(member);
 }

 public void listBooks() {
     System.out.println("Books in the Library:");
     for (Book book : books) {
         System.out.println(book);
     }
 }

 public void listMembers() {
     System.out.println("Library Members:");
     for (Member member : members) {
         System.out.println(member);
     }
 }

 public boolean borrowBook(String isbn, String memberId) {
     for (Book book : books) {
         if (book.getIsbn().equals(isbn) && book.isAvailable()) {
             book.setAvailable(false);
             System.out.println("Book borrowed successfully by Member ID: " + memberId);
             return true;
         }
     }
     System.out.println("Book not available.");
     return false;
 }

 public boolean returnBook(String isbn) {
     for (Book book : books) {
         if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
             book.setAvailable(true);
             System.out.println("Book returned successfully.");
             return true;
         }
     }
     System.out.println("Book not found.");
     return false;
 }
}
