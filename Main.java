package johnvesslyalti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Library Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. List Books");
            System.out.println("4. List Members");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;
                case 2:
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    String memberId = scanner.nextLine();
                    library.addMember(new Member(name, memberId));
                    break;
                case 3:
                    library.listBooks();
                    break;
                case 4:
                    library.listMembers();
                    break;
                case 5:
                    System.out.print("Enter book ISBN to borrow: ");
                    String borrowIsbn = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    String borrowMemberId = scanner.nextLine();
                    library.borrowBook(borrowIsbn, borrowMemberId);
                    break;
                case 6:
                    System.out.print("Enter book ISBN to return: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnIsbn);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
