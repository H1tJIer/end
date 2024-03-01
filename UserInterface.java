import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public int getUserChoice() {
        System.out.println("\n1. Add Author to Inventory");
        System.out.println("2. Add Book to Inventory");
        System.out.println("3. Display Available Books");
        System.out.println("4. Update Book in Inventory");
        System.out.println("5. Delete Book from Inventory");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }


    public String getAuthorName() {
        System.out.print("Enter author name: ");
        return scanner.nextLine();
    }

    public String getBookName() {
        System.out.print("Enter book name: ");
        return scanner.nextLine();
    }

    public String getGenre() {
        System.out.print("Enter genre: ");
        return scanner.nextLine();
    }

    public int getAuthorId() {
        System.out.print("Enter author (by id): ");
        int id = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        return id;
    }


    public String getOldBookName() {
        System.out.print("Enter old book name: ");
        return scanner.nextLine();
    }

    public String getNewBookName() {
        System.out.print("Enter new book name: ");
        return scanner.nextLine();
    }

    public String getBookToDelete() {
        System.out.print("Enter book name to delete: ");
        return scanner.nextLine();
    }
}
