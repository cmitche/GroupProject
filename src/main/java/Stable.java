import java.util.ArrayList;

public class Stable {
    ArrayList<Horse> stable = new ArrayList<>();

    public Stable(){}

    public Stable(ArrayList<Horse> stable) {
        this.stable = stable;
    }

    public ArrayList<Horse> getStable() {
        return stable;
    }

    public void setStable(ArrayList<Horse> stable) {
        this.stable = stable;
    }

    @Override
    public String toString() {
        return ""+ stable;
    }
}
