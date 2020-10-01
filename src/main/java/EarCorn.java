import java.util.ArrayList;

public class EarCorn implements IProduce, IEdible{
    private int leaves;

    public EarCorn(int leaves){
        super();
        this.leaves = leaves;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves){
        this.leaves = leaves;
    }

    @Override
    public String toString() {
        return "EarCorn";
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
    public boolean hasBeenFertilized(IProduce a) {
        return false;
    }

    @Override
    public boolean isEdible() {
        return false;
    }
}
