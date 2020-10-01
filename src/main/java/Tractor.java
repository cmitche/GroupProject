import java.util.ArrayList;

public class Tractor implements IFarmVechile, Rideable , IProduce{
    CropRow cropRow;

    public Tractor(CropRow cropRow) {
        this.cropRow = cropRow;
    }

    public Tractor(){}

    public void harvest(ArrayList<CropRow> row) {
        for (CropRow crowRow: row){
            crowRow.setHarvested(true);
        }
    }
    public boolean hasBeenFertilized(ArrayList<CropRow> produces) {
        for (IProduce produce: produces){
            if (!produce.getHarvested()){
                return false;
            }
        }
        return true;
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
    public void operateFarm() {

    }

    @Override
    public void makeNoise() {

    }
}