public class EarCorn {
    private int leaves;

    public EarCorn(int leaves){
        this.leaves = leaves;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves){
        this.leaves = leaves;
    }

    @Override
    public String toString() {
        return "EarCorn{" +
                "leaves=" + leaves +
                '}';
    }
}
