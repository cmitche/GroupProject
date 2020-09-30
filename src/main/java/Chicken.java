public class Chicken implements IProduce{
    Egg egg;
    private String name;
    private char gender;


    public Chicken(String name, char gender, Egg egg) {
        this.name = name;
        this.gender = gender;
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
        public void setFertilized ( boolean fertilized){

        }

        @Override
        public boolean hasBeenHarvested () {
            return false;
        }

        @Override
        public boolean hasBeenFertilized (IProduce a){
            return false;
        }

        @Override
        public String toString(){
            return "\n" + name + " | " + gender + " | " + egg + "\n";
        }
    }

