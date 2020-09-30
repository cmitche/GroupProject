import java.util.ArrayList;

public class Field {

    public ArrayList<CropRow> listOfCropRows;

    //constructor
    public Field(ArrayList<CropRow> listOfCropRows) {
        this.listOfCropRows = listOfCropRows;
    }

    public Field(){}

    @Override
    public String toString() {
        return "Field{" +
                "listOfCropRows=" + listOfCropRows +
                '}';
    }
}
