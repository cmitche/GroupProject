public class Pilot extends Person implements IRider{
    CropDuster cropDuster;

    public Pilot(String name, CropDuster cropDuster) {
        super(name);
        this.cropDuster = cropDuster;
    }

    public CropDuster getCropDuster() {
        return cropDuster;
    }

    public void setCropDuster(CropDuster cropDuster) {
        this.cropDuster = cropDuster;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "cropDuster=" + cropDuster +
                '}';
    }

    @Override
    public void mount(Rideable object) {
        System.out.println("flying the plane.");
    }

    @Override
    public void dismount(Rideable object) {
        System.out.println("Landing Plane...");
    }
}
