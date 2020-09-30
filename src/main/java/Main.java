import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Chicken> whiteChicken = new ArrayList<>();
        whiteChicken.add(new Chicken());
        whiteChicken.add(new Chicken());
        whiteChicken.add(new Chicken());

        ArrayList<Chicken> dumbChicken = new ArrayList<>();
        dumbChicken.add(new Chicken());
        dumbChicken.add(new Chicken());
        dumbChicken.add(new Chicken());

        ArrayList<Chicken> brownChicken = new ArrayList<>();
        brownChicken.add(new Chicken());
        brownChicken.add(new Chicken());
        brownChicken.add(new Chicken());
        brownChicken.add(new Chicken());
        brownChicken.add(new Chicken());

        ArrayList<Chicken> yellowChicken = new ArrayList<>();
        yellowChicken.add(new Chicken());
        yellowChicken.add(new Chicken());
        yellowChicken.add(new Chicken());
        yellowChicken.add(new Chicken());

        ChickenCoop[] chickenCoops = new ChickenCoop[4];
        chickenCoops[0].setCoop(brownChicken);
        chickenCoops[1].setCoop(whiteChicken);
        chickenCoops[2].setCoop(dumbChicken);
        chickenCoops[3].setCoop(yellowChicken);

        ArrayList<Horse> brownHorse = new ArrayList<>();
        brownHorse.add(new Horse());
        brownHorse.add(new Horse());
        brownHorse.add(new Horse());

        ArrayList<Horse> blueHorse = new ArrayList<>();
        blueHorse.add(new Horse());
        blueHorse.add(new Horse());
        blueHorse.add(new Horse());
        blueHorse.add(new Horse());

        Horse[] pinkHorse = new Horse[3];
        pinkHorse[0] = new Horse();
        pinkHorse[1] = new Horse();
        pinkHorse[2] = new Horse();

        ArrayList<Stable> stables = new ArrayList<>();
        stables.add(new Stable());


        Farmhouse[] house = new Farmhouse[1];
        house[0] = new Farmhouse();

        //Farm farm = new Farm();

        //System.out.println("Printing out FarmHouse, Coops and Stables: "+ farm);

//        System.out.println("Printing Stables"+ stable.length);
//        System.out.println(stable[0].getStable());
//        System.out.println(stable[1].getStable());
//        System.out.println(stable[2].getStable());
//
//        System.out.println(blueHorse);
//        System.out.println(blueHorse);
//        System.out.println(pinkHorse);
//        System.out.println(stable[0]);
//        System.out.println(stable[1]);
//        System.out.println(stable[2]);
    }

}
