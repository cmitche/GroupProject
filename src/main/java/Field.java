import java.util.ArrayList;

public class Field {

    public ArrayList<CropRow> listOfCropRows;

    public Field(ArrayList<CropRow> listOfCropRows) {
        this.listOfCropRows = listOfCropRows;
    }

    public Field(){}

    public ArrayList<CropRow> getListOfCropRows() {
        return listOfCropRows;
    }

    public void setListOfCropRows(ArrayList<CropRow> listOfCropRows) {
        this.listOfCropRows = listOfCropRows;
    }

    @Override
    public String toString() {
        return "\n" + listOfCropRows;
    }
}
