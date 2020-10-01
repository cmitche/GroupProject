import java.util.ArrayList;

public interface IFarmVechile extends IVehicle {
    public void operateFarm();
    void fertilize(ArrayList<CropRow> row);
}