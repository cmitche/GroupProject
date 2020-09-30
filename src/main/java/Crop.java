public abstract class Crop implements IProduce{

    //- hasBeenHarvested: boolean
    private boolean hasBeenHarvested;

    //- hasBeenFertilized: boolean
    private boolean hasBeenFertilized;

    //+ fertilized(): void
    public abstract void fertilized();

    //+ harvest(): void
    public abstract void harvest();

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public abstract boolean hasBeenFertilized(IProduce a);

<<<<<<< HEAD

=======
    @Override
    public String toString() {
        return "Crop{" +
                "hasBeenHarvested=" + hasBeenHarvested +
                ", hasBeenFertilized=" + hasBeenFertilized +
                '}';
    }
>>>>>>> daee5edc0156e15bb77d6540f3adf798e537f570
}