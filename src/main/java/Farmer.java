public class Farmer extends Person implements IEater, IBotanist {

    public Farmer(String name) {
        super(name);
    }

    @Override
    public String isEating() {
        return null;
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {
        
    }
}
