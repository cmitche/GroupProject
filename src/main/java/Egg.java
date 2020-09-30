public class Egg implements IProduce, IEdible{

    private String color;

    public Egg(String color) {
        this.color = color;
    }

    @Override
    public boolean isEdible() {
        return false;
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
    public String toString() {
        return "Egg color: "+ color;
    }
}
