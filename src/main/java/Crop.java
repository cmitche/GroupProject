public abstract class Crop implements IProduce{
    //- hasBeenHarvested: boolean
    private boolean hasBeenHarvested;

    //- hasBeenFertilized: boolean
    private boolean hasBeenFertilized;


    //+ fertilized(): void
    public abstract void fertilized();

    //+ harvest(): void
    public abstract void harvest();

    //+ getHasBeenFertilized(): void
    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }
}