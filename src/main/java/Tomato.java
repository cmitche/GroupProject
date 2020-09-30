public class Tomato {
    private String color;
    private double weightInLbs;
    private boolean isRipe;

    public Tomato(String color, double weightInLbs, boolean isRipe) {
        this.color = color;
        this.weightInLbs = weightInLbs;
        this.isRipe = isRipe;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeightInLbs() {
        return weightInLbs;
    }

    public void setWeightInLbs(double weightInLbs) {
        this.weightInLbs = weightInLbs;
    }

    public boolean isRipe() {
        return isRipe;
    }

    public void setRipe(boolean ripe) {
        isRipe = ripe;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "color='" + color + '\'' +
                ", weightInLbs=" + weightInLbs +
                ", isRipe=" + isRipe +
                '}';
    }
}
