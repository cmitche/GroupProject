import java.util.ArrayList;

public class Farm {
    ArrayList<Stable> stables = new ArrayList<>();
    ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
    ArrayList<Farmhouse> farmhouse = new ArrayList<>();

    public Farm(ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, ArrayList<Farmhouse> farmhouse) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmhouse = farmhouse;
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public void setStables(ArrayList<Stable> stables) {
        this.stables = stables;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public ArrayList<Farmhouse> getFarmhouse() {
        return farmhouse;
    }

    public void setFarmhouse(ArrayList<Farmhouse> farmhouse) {
        this.farmhouse = farmhouse;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "stables=" + stables +
                ", chickenCoops=" + chickenCoops +
                ", farmhouse=" + farmhouse +
                '}';
    }
}
