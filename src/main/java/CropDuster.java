public class CropDuster implements IAirCraft, IFarmVechile  {
    private int wheels;

    public CropDuster(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void fly() { }
    public void operateFarm() { }

    public void fertilize(CropRow croprow){};

    @Override
    public String toString() {
        return "CropDuster{" +
                "wheels=" + wheels +
                '}';
    }
}
