public class Author extends Entity {

    public Author(String name) {
        super(name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Author id: " + id + ", name: " + name);
    }
}
