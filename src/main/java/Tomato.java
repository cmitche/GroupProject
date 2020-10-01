import java.util.ArrayList;

public class Tomato extends Crop implements IEdible{

    String name;

    public Tomato(){this.name = "New Tomato";}
    public Tomato(String name) {this.name = name;}

    @Override
    public void fertilized() {

    }

    @Override
    public void harvest() {

    }

    @Override
    public boolean hasBeenFertilized(IProduce a) {
        return false;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean isEdible() {
        return true;
    }

    @Override
    public String getName() {
        return "Tomato";
    }

    @Override
    public boolean isHarvested() {
        return false;
    }

    @Override
    public boolean getHarvested() {
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
    public boolean getFertilized() {
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
    public boolean hasBeenHarvested(ArrayList<CropRow> produces) {
        return false;
    }

    @Override
    public boolean hasBeenFertilized(ArrayList<CropRow> produces) {
        return false;
    }
}
