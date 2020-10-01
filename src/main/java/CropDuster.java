import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

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
    public void setHarvested(boolean harvested) {

    }

    @Override
    public boolean isFertilized() {
        return false;
    }

    @Override
    public boolean fertilize(ArrayList<CropRow> row) {
        return true;
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

}
