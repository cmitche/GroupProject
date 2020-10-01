import java.util.ArrayList;

public class Tuesday {

    public static void main(String[] args) {
        Farmer froilan = new Farmer("Froilan");


        ArrayList<CropRow> cropRowArrayList1 = new ArrayList<>();
        cropRowArrayList1.add(0, new CropRow(new CornStalk(new EarCorn(4)),23));
        cropRowArrayList1.add(1, new CropRow(new TomatoPlant(new Tomato()), 23));
        cropRowArrayList1.add(2, new CropRow(new CornStalk(new EarCorn(5)),23));

        ArrayList<CropRow> cropRowArrayList2 = new ArrayList<>();
        cropRowArrayList2.add(0, new CropRow(new CornStalk(new EarCorn(4)),23));
        cropRowArrayList2.add(1, new CropRow(new TomatoPlant(new Tomato()), 23));
        cropRowArrayList2.add(2, new CropRow(new CornStalk(new EarCorn(5)),23));

        ArrayList<CropRow> cropRowArrayList3 = new ArrayList<>();
        cropRowArrayList3.add(0, new CropRow(new CornStalk(new EarCorn(4)),23));
        cropRowArrayList3.add(1, new CropRow(new TomatoPlant(new Tomato()), 23));
        cropRowArrayList3.add(2, new CropRow(new CornStalk(new EarCorn(5)),23));

        ArrayList<CropRow> cropRowArrayList4 = new ArrayList<>();
        cropRowArrayList4.add(0, new CropRow(new CornStalk(new EarCorn(4)),23));
        cropRowArrayList4.add(1, new CropRow(new TomatoPlant(new Tomato()), 21));
        cropRowArrayList4.add(2, new CropRow(new CornStalk(new EarCorn(5)),23));

        ArrayList<CropRow> cropRowArrayList5 = new ArrayList<>();
        cropRowArrayList5.add(0, new CropRow(new CornStalk(new EarCorn(4)),23));
        cropRowArrayList5.add(1, new CropRow(new TomatoPlant(new Tomato()), 23));
        cropRowArrayList5.add(2, new CropRow(new CornStalk(new EarCorn(5)),23));



        ChickenCoop coop1 = new ChickenCoop();
        ChickenCoop coop2 = new ChickenCoop();
        ChickenCoop coop3 = new ChickenCoop();
        ChickenCoop coop4 = new ChickenCoop();

        ArrayList<Chicken> brownChickens = new ArrayList<>();
        brownChickens.add(0,new Chicken("Rosetta", 'M', new Egg(1,"Brown")));
        brownChickens.add(1,new Chicken("Rose", 'M', new Egg(1,"Brown")));
        brownChickens.add(2,new Chicken("Gret", 'F', new Egg(1,"Brown")));
        brownChickens.add(3,new Chicken("Ireals", 'F', new Egg(2,"Brown")));
        brownChickens.add(4,new Chicken("Ireals", 'F', new Egg(2,"Brown")));

        ArrayList<Chicken> whiteChickens = new ArrayList<>();
        whiteChickens.add(0,new Chicken("Hearlk", 'M', new Egg(2,"White")));
        whiteChickens.add(1,new Chicken("Getta", 'F', new Egg(1,"White")));
        whiteChickens.add(2,new Chicken("Tina", 'F', new Egg(3,"White")));
        whiteChickens.add(3,new Chicken("Tatiana", 'F', new Egg(1,"White")));

        ArrayList<Chicken> greyChickens = new ArrayList<>();
        greyChickens.add(0,new Chicken("Gerald", 'M', new Egg(1,"White")));
        greyChickens.add(1,new Chicken("Gilaa", 'F', new Egg(1,"Brown")));
        greyChickens.add(2,new Chicken("Paris", 'F', new Egg(2,"White")));

        ArrayList<Chicken> hens = new ArrayList<>();
        hens.add(0,new Chicken("Sam", 'M', new Egg(1,"White")));
        hens.add(1,new Chicken("Felix", 'M', new Egg(1,"Brown")));
        hens.add(2,new Chicken("Joe", 'M', new Egg(2,"White")));

        coop1.setCoop(brownChickens);
        coop2.setCoop(greyChickens);
        coop3.setCoop(whiteChickens);
        coop4.setCoop(hens);

        Stable stable = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

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

        stable.setStable(candyPaintHorses);
        stable2.setStable(brownHorses);
        stable3.setStable(whiteHorses);

        IFarmVechile tractor = new Tractor();
        IFarmVechile bigTractor = new Tractor();

        froilan.setTractor((Tractor) bigTractor);

        CropDuster cropDuster = new CropDuster();

        Pilot froilanda = new Pilot("Froilanda", cropDuster);

        for(Horse horses: candyPaintHorses){
            froilan.mount(horses);
            System.out.println(horses.getName());
            froilanda.mount(horses);
            System.out.println(horses.getName());
            System.out.println("Horses galloping? " + horses.isGalloping());
            froilan.dismount(horses);
            System.out.println(horses.getName());
            froilanda.dismount(horses);
            System.out.println(horses.getName());
            froilan.feeding(horses, 3, new EarCorn(4));
            horses.makeNoise();
        }for(Horse horses: brownHorses){
            froilan.mount(horses);
            System.out.println(horses.getName());
            froilanda.mount(horses);
            System.out.println(horses.getName());
            System.out.println("Horses galloping? " + horses.isGalloping());
            froilan.dismount(horses);
            System.out.println(horses.getName());
            froilanda.dismount(horses);
            System.out.println(horses.getName());
            froilan.feeding(horses, 3, new EarCorn(4));
            horses.makeNoise();
        }for(Horse horses: whiteHorses) {
            froilan.mount(horses);
            System.out.println(horses.getName());
            froilanda.mount(horses);
            System.out.println(horses.getName());
            System.out.println("Horses galloping? " + horses.isGalloping());
            froilan.dismount(horses);
            System.out.println(horses.getName());
            froilanda.dismount(horses);
            System.out.println(horses.getName());
            froilan.feeding(horses, 3, new EarCorn(4));
            horses.makeNoise();
        }


        IEdible[] ediblesFroilan = {(IEdible) new EarCorn(3), new Tomato(), new Tomato(), new Egg(2, "Scrambled")};
        IEdible[] ediblesFroilana = {new EarCorn(3), new EarCorn(4), new Tomato(),new Egg(5, "Sunny Side Up") };

        froilan.isEating(ediblesFroilan);
        froilanda.isEating(ediblesFroilana);

        /*for(Chicken chicken: brownChickens){
            froilan.feeding(chicken,1, new EarCorn(1));
            System.out.println(chicken.getEgg());
            chicken.egg.isFertilized();
            chicken.egg.setFertilized(true);
            chicken.fertileEgg(chicken.egg);
            System.out.println(chicken.egg.isFertilized());
        }*/

        for(CropRow field1: cropRowArrayList1){
            System.out.println(field1.getCrop());
           froilan.tractor.operateFarm();
           froilan.tractor.makeNoise();
           froilan.tractor.harvest(cropRowArrayList1);
        }
        System.out.println("Harvested " +froilan.tractor.hasBeenFertilized(cropRowArrayList1));
        for(CropRow field1: cropRowArrayList2){
            System.out.println(field1.getCrop());
            froilan.tractor.operateFarm();
            froilan.tractor.makeNoise();
            froilan.tractor.harvest(cropRowArrayList2);
        }
        System.out.println("Harvested " +froilan.tractor.hasBeenFertilized(cropRowArrayList2));
        for(CropRow field1: cropRowArrayList3){
            System.out.println(field1.getCrop());
            froilan.tractor.operateFarm();
            froilan.tractor.makeNoise();
            froilan.tractor.harvest(cropRowArrayList3);
        }
        System.out.println("Harvested " +froilan.tractor.hasBeenFertilized(cropRowArrayList3));
        froilan.dismount((Rideable) bigTractor);
    }

}
