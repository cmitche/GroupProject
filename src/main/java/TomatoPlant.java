public class TomatoPlant extends Crop{

    Tomato tomato;

    public Tomato yield(){
        return tomato;
    }

    public TomatoPlant(Tomato tomato) {
        this.tomato = tomato;
    }

    @Override
    public void fertilized() {

    }

    @Override
    public void harvest() {

    }

    @Override
    public boolean getHasBeenFertilized() {
        return super.getHasBeenFertilized();
    }

    @Override
    public boolean hasBeenFertilized(IProduce a) {
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
}
