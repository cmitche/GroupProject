public class Chicken extends Produce{
    Egg egg;

    public Chicken(){}
    public Chicken(Egg egg) {
        this.egg = egg;
    }

    public Egg getEgg() {
        return egg;
    }

    public void setEgg(Egg egg) {
        this.egg = egg;
    }

    public void fertileEgg(Egg egg){
        if(hasBeenFertilized(egg)){

        }
    }

}
