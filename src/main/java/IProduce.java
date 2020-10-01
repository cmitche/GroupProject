import java.util.ArrayList;

public interface IProduce {
    boolean harvested = true;
    boolean fertilized = true;

    boolean isHarvested();

    void setHarvested(boolean harvested);

    boolean isFertilized();

    boolean fertilize(ArrayList<CropRow> row);

    void setFertilized(boolean fertilized);

    boolean hasBeenHarvested();

    boolean hasBeenFertilized(IProduce a);
}
