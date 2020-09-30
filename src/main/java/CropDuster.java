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
    //Need to hit up Yas my Intellji did not correctly pull all her classes despite git saying it did
    public void fertilize(CropRow croprow){};

    @Override
    public void operateFarm(Farm farm) {

    }

    @Override
    public String toString() {
        return "CropDuster{" +
                "wheels=" + wheels +
                '}';
    }
}
