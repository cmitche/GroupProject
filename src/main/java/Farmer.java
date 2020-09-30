public class Farmer extends Person implements IEater{

    public Farmer(String name) {
        super(name);
    }

    @Override
    public String isEating() {
        return null;
    }

}