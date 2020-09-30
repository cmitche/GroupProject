import java.util.ArrayList;

public class CropRow {
    //properties/attributes/instance field
    public ArrayList<CropRow> listOfCropRows;

    ArrayList<CropRow> cropRows = new ArrayList<CropRow>();

    //constructor
    public CropRow(ArrayList<CropRow> listOfCropRows, ArrayList<CropRow> cropRows) {
        this.listOfCropRows = listOfCropRows;
        this.cropRows = cropRows;

    }
}
