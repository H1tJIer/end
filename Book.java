public class Book extends Entity {
    private String genre;
    private Author author;

    public Book(String name, String genre, Author author) {
        super(name);
        this.genre = genre;
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book id: " + this.id + ", name: " + this.name + ", genre: " + this.genre + ", author: " + this.author.getName());
    }
}
