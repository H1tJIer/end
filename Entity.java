public abstract class Entity {
    protected int id;
    protected String name;

    public int getId() {
        return id;
    }

    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();
}
