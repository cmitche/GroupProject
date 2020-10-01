import java.util.ArrayList;

public interface IProduce {
    boolean harvested = false;
    boolean fertilized = false;

    boolean isHarvested();

    boolean getHarvested();

    void setHarvested(boolean harvested);

    boolean isFertilized();



    boolean getFertilized();

    void setFertilized(boolean fertilized);

    boolean hasBeenHarvested();

    boolean hasBeenHarvested(ArrayList<CropRow> produces);

    boolean hasBeenFertilized(ArrayList<CropRow> produces);
}
