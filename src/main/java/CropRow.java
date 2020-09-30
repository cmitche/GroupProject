import java.util.ArrayList;

public class CropRow {
    private int lengthInYards;
    private int plots;

    //properties/attributes/instance field
    public ArrayList<CropRow> listOfCropRows;

    ArrayList<CropRow> cropRows = new ArrayList<CropRow>();

    public CropRow(int lengthInYards, int plots, ArrayList<CropRow> listOfCropRows, ArrayList<CropRow> cropRows) {
        this.lengthInYards = lengthInYards;
        this.plots = plots;
        this.listOfCropRows = listOfCropRows;
        this.cropRows = cropRows;
    }

    public int getLengthInYards() {
        return lengthInYards;
    }

    public void setLengthInYards(int lengthInYards) {
        this.lengthInYards = lengthInYards;
    }

    public int getPlots() {
        return plots;
    }

    public void setPlots(int plots) {
        this.plots = plots;
    }

    public ArrayList<CropRow> getListOfCropRows() {
        return listOfCropRows;
    }

    public void setListOfCropRows(ArrayList<CropRow> listOfCropRows) {
        this.listOfCropRows = listOfCropRows;
    }

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }

    public void setCropRows(ArrayList<CropRow> cropRows) {
        this.cropRows = cropRows;
    }

    @Override
    public String toString() {
        return "CropRow{" +
                "lengthInYards=" + lengthInYards +
                ", plots=" + plots +
                ", listOfCropRows=" + listOfCropRows +
                ", cropRows=" + cropRows +
                '}';
    }
}
