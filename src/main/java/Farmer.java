public class Farmer extends Person implements IEater, IRider{

    public Farmer(String name) {
        super(name);
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
        System.out.print("she be riding this ");
    }

    @Override
    public void dismount(Rideable object) {
        System.out.print("Getting off ");
    }
}