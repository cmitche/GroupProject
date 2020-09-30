public class Pilot extends Person{
    private int hat;
    private int googles;
    private int gloves;

    public Pilot(int hat, int googles, int gloves) {
        this.hat = hat;
        this.googles = googles;
        this.gloves = gloves;
    }

    public int getHat() {
        return hat;
    }

    public void setHat(int hat) {
        this.hat = hat;
    }

    public int getGoogles() {
        return googles;
    }

    public void setGoogles(int googles) {
        this.googles = googles;
    }

    public int getGloves() {
        return gloves;
    }

    public void setGloves(int gloves) {
        this.gloves = gloves;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "hat=" + hat +
                ", googles=" + googles +
                ", gloves=" + gloves +
                ", name='" + name + '\'' +
                '}';
    }
}
