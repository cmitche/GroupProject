import java.util.ArrayList;

public class Chicken extends Animal implements IProduce{
    Egg egg;
    private String name;
    private char gender;


    public Chicken(String name, char gender, Egg egg) {
        this.name = name;
        this.gender = gender;
        this.egg = egg;
    }

    public Chicken(Egg egg) {
        this.egg = egg;
    }

        public Egg getEgg () {
            return egg;
        }

        public void setEgg (Egg egg){
            this.egg = egg;
        }

        public void fertileEgg (Egg egg){
            if (hasBeenFertilized(egg)) {
                System.out.println("Has been fertilized.");
            }
        }

    private boolean hasBeenFertilized(Egg egg) {
        if(egg.getFertilized()){
            return true;
        }
        else return false;
    }

    public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public char getGender () {
            return gender;
        }

        public void setGender ( char gender){
            this.gender = gender;
        }



        @Override
        public boolean isHarvested () {
            return false;
        }

    @Override
    public boolean getHarvested() {
        return false;
    }

    @Override
        public void setHarvested ( boolean harvested){

        }

        @Override
        public boolean isFertilized () {
            return false;
        }


    @Override
    public boolean getFertilized() {
        return false;
    }

    @Override
        public void setFertilized (boolean fertilized){
    }

    @Override
    public boolean hasBeenHarvested () {
            return false;
        }

    @Override
    public boolean hasBeenHarvested(ArrayList<CropRow> produces) {
        return false;
    }

    @Override
    public boolean hasBeenFertilized(ArrayList<CropRow> produces) {
        return false;
    }


    @Override
    public String toString(){
        return "\n" + name + " | " + gender + " | " + egg + "\n";
    }

    @Override
    public void makeNoise() {
        System.out.println("Cockaddoole");
    }

    @Override
    public void isEating(IEdible edible) {
        System.out.println("Cluck cluck.."+edible);
    }
    }

