import java.util.ArrayList;

public class Farm {

    ArrayList<Stable> stables = new ArrayList<>();
    ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
    ArrayList<Farmhouse> farmHouse = new ArrayList<>();
    ArrayList<Field> field = new ArrayList<>();

    public Farm( ArrayList<Field> field, ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, ArrayList<Farmhouse> farmHouse) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
        this.field = field;
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public ArrayList<Field> getField() {
        return field;
    }

    public void setField(ArrayList<Field> field) {
        this.field = field;
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

    public ArrayList<Farmhouse> getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(ArrayList<Farmhouse> farmHouse) {
        this.farmHouse = farmHouse;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "stables=" + stables +
                ", chickenCoops=" + chickenCoops +
                ", farmHouse=" + farmHouse +
                ", field=" + field +
                '}';
    }
}
