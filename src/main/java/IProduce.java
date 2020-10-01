import java.util.ArrayList;

public interface IProduce {
    boolean harvested = true;
    boolean fertilized = false;

    boolean isHarvested();

    void setHarvested(boolean harvested);

    boolean isFertilized();

    void fertilize(ArrayList<CropRow> row);

    boolean getFertilized();

    void setFertilized(boolean fertilized);

    boolean hasBeenHarvested();

    boolean hasBeenFertilized(ArrayList<CropRow> produces);
}
