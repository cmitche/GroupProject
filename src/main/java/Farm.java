public class Farm {
    Stable[] stable;
    ChickenCoop[] chickenCoop;
    Farmhouse[] farmhouse;

    public Stable[] getStable() {
        return stable;
    }

    public void setStable(Stable[] stable) {
        this.stable = stable;
    }

    public ChickenCoop[] getChickenCoop() {
        return chickenCoop;
    }

    public void setChickenCoop(ChickenCoop[] chickenCoop) {
        this.chickenCoop = chickenCoop;
    }

    public Farmhouse[] getFarmhouse() {
        return farmhouse;
    }

    public void setFarmhouse(Farmhouse[] house) {
        farmhouse = house;
    }

    public Farm(Stable[] stable, ChickenCoop[] coop, Farmhouse[] house){
        this.stable = stable;
        this.chickenCoop = coop;
        farmhouse = house;
    }
}
