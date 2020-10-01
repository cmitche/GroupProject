import java.util.ArrayList;

public class Egg implements IProduce, IEdible{

    private int num;
    private String color;

    public Egg(int num, String color) {
        this.num = num;
        this.color = color;
    }

    @Override
    public boolean isEdible() {
        return false;
    }

    @Override
    public boolean isHarvested() {
        return false;
    }

    @Override
    public void setHarvested(boolean harvested) {

    }

    @Override
    public boolean isFertilized() {
        return false;
    }

    @Override
    public boolean fertilize(ArrayList<CropRow> row) {
        return false;
    }

    @Override
    public void setFertilized(boolean fertilized) {

    }

    @Override
    public boolean hasBeenHarvested() {
        return false;
    }

    @Override
    public boolean hasBeenFertilized(IProduce a) {
        return false;
    }

    @Override
    public String toString() {
        return num+" Eggs,"+" type: " + color;
    }
}
