public class Produce {
    private boolean harvested;
    private boolean fertilized;

    public boolean isHarvested() {
        return harvested;
    }

    public void setHarvested(boolean harvested) {
        this.harvested = harvested;
    }

    public boolean isFertilized() {
        return fertilized;
    }

    public void setFertilized(boolean fertilized) {
        this.fertilized = fertilized;
    }

    public boolean hasBeenHarvested(){
        return harvested;
    }
    public boolean hasBeenFertilized(Produce a){
        return fertilized;
    }

}
