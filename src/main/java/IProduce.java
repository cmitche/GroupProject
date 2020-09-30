public interface IProduce {
    boolean harvested = true;
    boolean fertilized = true;

    public boolean isHarvested();

    public void setHarvested(boolean harvested);

    public boolean isFertilized();

    public void setFertilized(boolean fertilized);

    public boolean hasBeenHarvested();

    public boolean hasBeenFertilized(Produce a);
}
