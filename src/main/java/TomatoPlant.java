import java.util.ArrayList;

public class TomatoPlant extends Crop{

    Tomato tomato;

    public Tomato yield(){
        return tomato;
    }

    public TomatoPlant(Tomato tomato) {
        this.tomato = tomato;
    }

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

    @Override
    public String toString() {
        return "TomatoPlant";
    }
}
