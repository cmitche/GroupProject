import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Chicken[]
//
//        ChickenCoop[] chickenCoops = new ChickenCoop[4];
//        chickenCoops[0] = new brownChicken[brownChicken.length-1];


        Horse[] brownHorse = new Horse[3];
        brownHorse[0] = new Horse();
        brownHorse[1] = new Horse();
        brownHorse[2] = new Horse();

        Horse[] blueHorse = new Horse[3];
        blueHorse[0] = new Horse();
        blueHorse[1] = new Horse();
        blueHorse[2] = new Horse();

        Horse[] pinkHorse = new Horse[3];
        pinkHorse[0] = new Horse();
        pinkHorse[1] = new Horse();
        pinkHorse[2] = new Horse();

        Stable[] stables = new Stable[3];
        stables[0] = pinkHorse[pinkHorse.length-1];
        stables[1] = blueHorse[blueHorse.length-1];
        stables[2] = brownHorse[brownHorse.length-1];

        Farmhouse[] house = new Farmhouse[1];
        house[0] = new Farmhouse();


        Farm farm = new Farm(stables, );

    }

}
