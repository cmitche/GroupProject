public class Tomato implements IEdible{

    String name;

    public Tomato(){this.name = "New Tomato";}
    public Tomato(String name) {this.name = name;}

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean isEdible() {
        return true;
    }
}
