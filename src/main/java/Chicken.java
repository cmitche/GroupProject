import java.util.ArrayList;

public class Chicken extends Animal implements IProduce{
    Egg egg;
    private String name;
    private char gender;
    private boolean fertilized;


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
        public void setHarvested ( boolean harvested){

        }

        @Override
        public boolean isFertilized () {
            return false;
        }

    @Override
    public boolean fertilize(ArrayList<CropRow> row) {
        return false;
    }

    @Override
        public void setFertilized (boolean fertilized){
            this.fertilized = fertilized;
        }

        @Override
        public boolean hasBeenHarvested () {
            return false;
        }

        @Override
        public boolean hasBeenFertilized (IProduce a){

            if(a.isFertilized()) {
                return true;
            }else return false;
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

