public class Animal implements INoiseMaker,IEater{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Brrr");
    }

    @Override
    public void isEating(IEdible edible) {
        System.out.println("Animal Eats...");
    }

    @Override
    public void isEating(IEdible[] edible) {

    }
}