import java.util.ArrayList;

public class Tractor implements IFarmVechile, Rideable{
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
    public void fertilize(ArrayList<CropRow> row) {

    }

    @Override
    public void operateFarm() {

    }

    @Override
    public void makeNoise() {

    }
}