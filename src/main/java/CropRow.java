import java.util.ArrayList;

public class CropRow {
<<<<<<< HEAD
=======
    private int lengthInYards;
    private int plots;

    //properties/attributes/instance field
    ArrayList<CropRow> cropRows;
>>>>>>> daee5edc0156e15bb77d6540f3adf798e537f570

    ArrayList<Crop> cropRows;
    private int cropRowNum;

    public CropRow( int cropRowNum, ArrayList<Crop> cropRows) {
        this.cropRows = cropRows;
        this.cropRowNum = cropRowNum;
    }

<<<<<<< HEAD
    //constructor
    public CropRow(ArrayList<Crop> cropRows) {
        this.cropRows = cropRows;
    }

    public ArrayList<Crop> getCropRows() {
        return cropRows;
    }

    public void setCropRows(ArrayList<Crop> cropRows) {
        this.cropRows = cropRows;
    }

    public int getCropRowNum() {
        return cropRowNum;
    }

    public void setCropRowNum(int cropRowNum) {
        this.cropRowNum = cropRowNum;
    }
=======
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
>>>>>>> daee5edc0156e15bb77d6540f3adf798e537f570

    @Override
    public String toString() {
        return "CropRow{" +
<<<<<<< HEAD
                "cropRows=" + cropRows +
                ", cropRowNum=" + cropRowNum +
=======
                "lengthInYards=" + lengthInYards +
                ", plots=" + plots +
                ", listOfCropRows=" + listOfCropRows +
                ", cropRows=" + cropRows +
>>>>>>> daee5edc0156e15bb77d6540f3adf798e537f570
                '}';
    }
}
