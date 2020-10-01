public class Farmer extends Person implements IEater, IRider{

    Tractor tractor;

    public Farmer(String name, Tractor tractor) {
        super(name);
        this.tractor =tractor;
    }

    public void feeding(Animal animal, int quantity, IProduce produce){
        System.out.println("Giving "+ animal.getName()+ " "+quantity+" "+ produce);
    }

    @Override
    public void isEating(IEdible edible) {
        System.out.println("Chomping on "+ edible);
    }

    @Override
    public void mount(Rideable object) {
        System.out.println("Successfully hopped on this tractor ");
    }

    @Override
    public void dismount(Rideable object) {
        System.out.print("Getting off ");
    }
}