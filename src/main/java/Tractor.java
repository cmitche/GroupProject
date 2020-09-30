public class Tractor implements IFarmVechile {
    CropRow cropRow;

    public Tractor(CropRow cropRow) {
        this.cropRow = cropRow;
    }

    public Tractor(){}

    @Override
    public void operateFarm() {

    }
}
