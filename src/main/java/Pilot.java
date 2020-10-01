public class Pilot extends Person implements IRider, IEater{
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
        if (object instanceof CropDuster){
            System.out.println(getName() + " is riding a " + getCropDuster());
        }
        else{
            System.out.print(getName() + " is riding a " + object.getClass().getSimpleName() + " named ");
        }
    }

    @Override
    public void dismount(Rideable object) {
        System.out.print( getName() + " getting off ....");
    }

    @Override
    public void isEating(IEdible edible) {

    }

    @Override
    public void isEating(IEdible[] edible) {
        System.out.println(getName() + " is eating: ");
        for(IEdible edible1: edible){
            System.out.print(edible1.getName() + " ");
        }
        System.out.println();
    }
}
