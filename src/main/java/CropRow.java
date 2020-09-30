import java.util.ArrayList;

public class CropRow {
    //properties/attributes/instance field
    ArrayList<CropRow> cropRows;

    public ArrayList<CropRow> listOfCropRows;

    //constructor
    public CropRow(ArrayList<CropRow> listOfCropRows, ArrayList<CropRow> cropRows) {
        this.listOfCropRows = listOfCropRows;
        this.cropRows = cropRows;

    }
}
