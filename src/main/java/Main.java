
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Horse> candyPaintHorses = new ArrayList<>();
        candyPaintHorses.add(0,new Horse( "Red", "White Lightning", 8));
        candyPaintHorses.add(1,new Horse("Red", "Shit Brown", 5));
        candyPaintHorses.add(2,new Horse("Red", "Cracker Jack",10));

        ArrayList<Horse> brownHorses = new ArrayList<>();
        brownHorses.add(0,new Horse("White", "Xhit head",10));
        brownHorses.add(1,new Horse("White", "Dean Alam",10));
        brownHorses.add(2,new Horse("White", "Darel Jeeter",10));

        ArrayList<Horse> whiteHorses = new ArrayList<>();
        whiteHorses.add(0,new Horse("Blue", "Crackle Barrel", 5));
        whiteHorses.add(1,new Horse("Blue", "Brick Mode", 5));
        whiteHorses.add(2,new Horse("Blue", "Black Thunder", 5));

        ArrayList<Chicken> brownChickens = new ArrayList<>();
        brownChickens.add(0,new Chicken("Rosetta", 'M', new Egg("Brown")));
        brownChickens.add(1,new Chicken("Rose", 'M', new Egg("Brown")));
        brownChickens.add(2,new Chicken("Gret", 'F', new Egg("Brown")));
        brownChickens.add(3,new Chicken("Ireals", 'F', new Egg("Brown")));
        brownChickens.add(4,new Chicken("Ireals", 'F', new Egg("Brown")));

        ArrayList<Chicken> whiteChickens = new ArrayList<>();
        whiteChickens.add(0,new Chicken("Hearlk", 'M', new Egg("White")));
        whiteChickens.add(1,new Chicken("Getta", 'F', new Egg("White")));
        whiteChickens.add(2,new Chicken("Tina", 'F', new Egg("White")));
        whiteChickens.add(3,new Chicken("Tatiana", 'F', new Egg("White")));

        ArrayList<Chicken> greyChickens = new ArrayList<>();
        greyChickens.add(0,new Chicken("Gerald", 'M', new Egg("White")));
        greyChickens.add(1,new Chicken("Gilaa", 'F', new Egg("Brown")));
        greyChickens.add(2,new Chicken("Paris", 'F', new Egg("White")));

        ArrayList<Chicken> hens = new ArrayList<>();
        hens.add(0,new Chicken("Sam", 'M', new Egg("White")));
        hens.add(1,new Chicken("Felix", 'M', new Egg("Brown")));
        hens.add(2,new Chicken("Joe", 'M', new Egg("White")));

        ChickenCoop[] chickenCoops = new ChickenCoop[4];
        chickenCoops[0] = new ChickenCoop();
        chickenCoops[1] = new ChickenCoop();
        chickenCoops[2] = new ChickenCoop();
        chickenCoops[3] = new ChickenCoop();

        chickenCoops[0].setCoop(brownChickens);
        chickenCoops[1].setCoop(whiteChickens);
        chickenCoops[2].setCoop(greyChickens);
        chickenCoops[3].setCoop(hens);

        ArrayList<ChickenCoop> coops = new ArrayList<>();
        coops.add(chickenCoops[0]);
        coops.add(chickenCoops[1]);
        coops.add(chickenCoops[2]);
        coops.add(chickenCoops[3]);

        Stable[] stablez = new Stable[3];
        stablez[0] = new Stable();
        stablez[1] = new Stable();
        stablez[2] = new Stable();

        stablez[0].setStable(candyPaintHorses);
        stablez[1].setStable(whiteHorses);
        stablez[2].setStable(brownHorses);

        ArrayList<Stable> stables = new ArrayList<>();
        stables.add(stablez[0]);
        stables.add(stablez[1]);
        stables.add(stablez[2]);

        ArrayList<CropRow> cropRowArrayList = new ArrayList<>();
        cropRowArrayList.add(0, new CropRow(new CornStalk(new EarCorn(4)),23));
        cropRowArrayList.add(1, new CropRow(new TomatoPlant(new Tomato("Brown", 2.5, false)), 23));
        cropRowArrayList.add(2, new CropRow(new CornStalk(new EarCorn(5)),23));
        cropRowArrayList.add(3, new CropRow(new CornStalk(new EarCorn(7)),23));
        cropRowArrayList.add(4, new CropRow(new CornStalk(new EarCorn(7)),23));

        Field[] fields = new Field[5];
        fields[0] = new Field();
        fields[1] = new Field();
        fields[2] = new Field();
        fields[3] = new Field();
        fields[4] = new Field();

        fields[0].setListOfCropRows(cropRowArrayList);
        fields[1].setListOfCropRows(cropRowArrayList);
        fields[2].setListOfCropRows(cropRowArrayList);
        fields[3].setListOfCropRows(cropRowArrayList);
        fields[4].setListOfCropRows(cropRowArrayList);

        ArrayList<Field> fieldz = new ArrayList<>();
        fieldz.add(fields[0]);
        fieldz.add(fields[1]);
        fieldz.add(fields[2]);
        fieldz.add(fields[3]);
        fieldz.add(fields[4]);

        ArrayList<Person> hillBillies = new ArrayList<>();
        hillBillies.add(0, new Person("Darren"));
        hillBillies.add(1, new Person("Corey"));
        hillBillies.add(2, new Person("Raymundo"));
        hillBillies.add(3, new Person("Yasmin"));
        hillBillies.add(4, new Person("David"));

        Farmer froilan = new Farmer("Froilan");

        ArrayList<Farmhouse> house = new ArrayList<>();
        house.add(0, new Farmhouse(hillBillies));

        //Farm farm1 = new Farm(fields, stables, coops, house);

        System.out.println("Stable 1: "+ stables.get(0));
        System.out.println("");
        System.out.println("Stable 2: "+ stables.get(1));
        System.out.println("");
        System.out.println("Stable 3: "+ stables.get(2));

        System.out.println("Chicken Coop 1: "+ coops.get(0));
        System.out.println("");
        System.out.println("Chicken Coop 2: "+ coops.get(1));
        System.out.println("");
        System.out.println("Chicken Coop 3: "+ coops.get(2));
        System.out.println("");
        System.out.println("Chicken Coop 4: "+ coops.get(3));

        System.out.println("Feild 1: "+ fieldz);

    }
}