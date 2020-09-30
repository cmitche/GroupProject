public class Farmer extends Person implements IEater, IBotanist {
    private String name;

    public Farmer(String name) {
        this.name = name;
    }

    @Override
    public String isEating() {
        return null;
    }


    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                '}';
    }
}