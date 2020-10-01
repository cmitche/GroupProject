import java.util.ArrayList;

public class Field {

    public ArrayList<Crop> listOfCropRows;

    public Field(ArrayList<Crop> listOfCropRows) {
        this.listOfCropRows = listOfCropRows;
    }

    public Field(){}

    public ArrayList<Crop> getListOfCropRows() {
        return listOfCropRows;
    }

    public void setListOfCropRows(ArrayList<Crop> listOfCropRows) {
        this.listOfCropRows = listOfCropRows;
    }

    @Override
    public String toString() {
        return "\n" + listOfCropRows;
    }
}
