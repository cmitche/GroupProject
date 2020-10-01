import java.util.ArrayList;

public class CropDuster implements IAirCraft, IFarmVechile, Rideable, IProduce {


    public CropDuster() {
    }

    @Override
    public void fly() {
        System.out.println("High in the sky!");
    }

    @Override
    public void operateFarm() {
        System.out.println("Fertilizing crops...");
    }

    @Override
    public void makeNoise() {

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
    public void fertilize(ArrayList<CropRow> row) {
        for (CropRow crowRow: row){
            crowRow.setFertilized(true);
        }
    }

    @Override
    public boolean getFertilized() {
        return fertilized;
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
        for (IProduce produce: produces){
            if (!produce.getFertilized()){
                return false;
            }
        }
        return true;
    }


}
