import java.util.ArrayList;

public class CropRow {

    ArrayList<Crop> cropRows;
    private int cropRowNum;

    public CropRow( int cropRowNum, ArrayList<Crop> cropRows) {
        this.cropRows = cropRows;
        this.cropRowNum = cropRowNum;
    }

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

    @Override
    public String toString() {
        return "CropRow{" +
                "cropRows=" + cropRows +
                ", cropRowNum=" + cropRowNum +
                '}';
    }
}
