public class Farmer extends Person implements IEater, IRider, Botanist{

    Tractor tractor;

    public Farmer(String name){
        super(name);
    }

    public Farmer(String name, Tractor tractor) {
        super(name);
        this.tractor =tractor;
    }

    public Tractor getTractor() {
        return tractor;
    }

    public void setTractor(Tractor  tractor){
        this.tractor = tractor;
    }


    public void feeding(Animal animal, int quantity, IProduce produce){
        System.out.println("Giving "+ animal.getName()+ " "+quantity+" "+ produce);
    }

    @Override
    public void isEating(IEdible edible) {
        System.out.println("Chomping on "+ edible);
    }

    @Override
    public void isEating(IEdible[] edible) {
        System.out.println(getName() + " is eating: ");
        for(IEdible edible1: edible){
            System.out.print(edible1.getName() + " ");
        }
        System.out.println();
    }

    @Override
    public void mount(Rideable object) {
        if (object instanceof Tractor){
            System.out.println(getName() + " is riding a " + getTractor());
        }
        else{
            System.out.print(getName() + " is riding a " + object.getClass().getSimpleName() + " named ");
        }
    }

    @Override
    public void dismount(Rideable object) {
        System.out.print("Getting off ");
    }

    @Override
    public String toString() {
        return "Farmer " + getName() + " ";
    }

    @Override
    public String plantCrops(IProduce produce) {
        return produce + " is getting planted";
    }
}