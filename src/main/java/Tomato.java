public class Tomato {
    private int leaves;
    private String color;

    public Tomato(int leaves, String color) {
        this.leaves = leaves;
        this.color = color;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "leaves=" + leaves +
                ", color='" + color + '\'' +
                '}';
    }
}
