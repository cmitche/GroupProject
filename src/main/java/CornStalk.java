public class CornStalk extends Crop{

    EarCorn earCorn;

    public EarCorn yield(){
        return earCorn;
    }

    public CornStalk(EarCorn earCorn) {
        this.earCorn = earCorn;
    }

    @Override
    public void fertilized() {
        System.out.println("The Corn Has Been Fertilized.");
    }

    @Override
    public void harvest() {
        System.out.println("The Corn Is Ready For Harvest.");
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
        return "CornStalk{" +
                "earCorn=" + earCorn +
                '}';
    }
}
