import java.util.ArrayList;

public class CropDuster implements IAirCraft, IFarmVechile, Rideable {


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
    public void fertilize(ArrayList<CropRow> row) {
        for (CropRow crowRow: row){
            crowRow.setFertilized(true);
        }
    }


   /* @Override
    public boolean hasBeenFertilized(ArrayList<CropRow> produces) {
        for (IProduce produce: produces){
            if (!produce.getFertilized()){
                return false;
            }
        }
        return true;
    }*/


}
