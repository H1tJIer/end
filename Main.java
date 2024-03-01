public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager("jdbc:postgresql://localhost:5432/postgres", "postgres", "Shapok2006");
        UserInterface ui = new UserInterface();
        while (true) {
            int choice = ui.getUserChoice();
            switch (choice) {
                case 1:
                    String authorName = ui.getAuthorName();
                    dbManager.addAuthorToInventory(authorName);
                    break;
                case 2:
                    String bookName = ui.getBookName();
                    String genre = ui.getGenre();
                    dbManager.displayAvailableAuthors();
                    int authorId = ui.getAuthorId();
                    dbManager.addBookToInventory(bookName, genre, authorId);
                    break;
                case 3:
                    dbManager.displayAvailableBooks();
                    break;
                case 4:
                    String oldBookName = ui.getOldBookName();
                    String newBookName = ui.getNewBookName();
                    dbManager.updateBookInInventory(oldBookName, newBookName);
                    break;
                case 5:
                    String bookToDelete = ui.getBookToDelete();
                    dbManager.deleteBookFromInventory(bookToDelete);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}