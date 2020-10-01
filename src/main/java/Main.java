
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*Stable stable = new Stable();
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

        Field field1 = new Field();

        ArrayList<CropRow> cropRowArrayList = new ArrayList<>();
        cropRowArrayList.add(0, new CropRow(new CornStalk(new EarCorn(4)),23));
        cropRowArrayList.add(1, new CropRow(new TomatoPlant(new Tomato()), 23));
        cropRowArrayList.add(2, new CropRow(new CornStalk(new EarCorn(5)),23));
        cropRowArrayList.add(3, new CropRow(new CornStalk(new EarCorn(7)),23));
        cropRowArrayList.add(4, new CropRow(new CornStalk(new EarCorn(7)),23));

        field1.setListOfCropRows(cropRowArrayList);

        ArrayList<Person> hillBillies = new ArrayList<>();
        hillBillies.add(0, new Person("Darren"));
        hillBillies.add(1, new Person("Corey"));
        hillBillies.add(2, new Person("Raymundo"));
        hillBillies.add(3, new Person("Yasmin"));
        hillBillies.add(4, new Person("David"));
        hillBillies.add(5, new Person("Froilan"));
        hillBillies.add(6, new Person("Froilanda"));

        Farmhouse house = new Farmhouse(hillBillies);

        System.out.println(house.getPeople());

        CropDuster dusty = new CropDuster();

        Farmer froilan = new Farmer("Froilan", new Tractor());
        Person fodana = new Pilot("Fodana", dusty);
        fodana.mount(dusty);
        dusty.fly();

        dusty.operateFarm();

        fodana.dismount(dusty);

        for(Horse horses: candyPaintHorses){
            froilan.mount(horses);
            System.out.println(horses.getName());
            System.out.println("Horses galloping? " + horses.isGalloping());
            froilan.dismount(horses);
            System.out.println(horses.getName());
            froilan.feeding(horses, 3, new EarCorn(4));
            horses.makeNoise();
        }for(Horse horses: brownHorses){
            froilan.mount(horses);
            System.out.println(horses.getName());
            System.out.println("Horses galloping? " + horses.isGalloping());
            froilan.dismount(horses);
            System.out.println(horses.getName());
            froilan.feeding(horses, 3, new EarCorn(4));
            horses.makeNoise();
        }for(Horse horses: whiteHorses){
            froilan.mount(horses);
            System.out.println(horses.getName());
            System.out.println("Horses galloping? " + horses.isGalloping());
            froilan.dismount(horses);
            System.out.println(horses.getName());
            froilan.feeding(horses, 3, new EarCorn(4));
            horses.makeNoise();
        }

        froilan.isEating((IEdible) new EarCorn(3));
        froilan.isEating((IEdible)new Tomato("Tomato"));
        froilan.isEating((IEdible)new Tomato("Tomato"));

        froilan.isEating((IEdible)new Egg(5, "Sunny Side Up"));

        for(Chicken chicken: brownChickens){
            froilan.feeding(chicken,1, new EarCorn(1));
            System.out.println(chicken.getEgg());
            chicken.egg.isFertilized();
            chicken.egg.setFertilized(true);
            chicken.fertileEgg(chicken.egg);
            System.out.println(chicken.egg.isFertilized());
        }

        //froilan.isEating(new EarCorn(3));

        Tractor greenTractor = new Tractor();
        Tractor mixedTractor = new Tractor();

        greenTractor.operateFarm();*/
        System.out.println("------------------SUNDAY-------------------");
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

        ArrayList<Person> hillBillies = new ArrayList<>();
        hillBillies.add(0, new Person("Darren"));
        hillBillies.add(1, new Person("Corey"));
        hillBillies.add(2, new Person("Raymundo"));
        hillBillies.add(3, new Person("Yasmin"));
        hillBillies.add(4, new Person("David"));
        hillBillies.add(5, new Person("Froilan"));
        hillBillies.add(6, new Person("Froilanda"));

        Farmhouse house = new Farmhouse(hillBillies);

        // System.out.println(house.getPeople());

        CropDuster dusty = new CropDuster();

        Farmer froilan = new Farmer("Froilan",new Tractor());
        Person fodana = new Pilot("Fodana", dusty);
        //fodana.mount(dusty);
        // dusty.fly();

        // dusty.operateFarm();

        // fodana.dismount(dusty);

        for(Horse horses: candyPaintHorses){
            froilan.mount(horses);
            System.out.println(horses.getName());
            System.out.println("Horses galloping? " + horses.isGalloping());
            froilan.dismount(horses);
            System.out.println(horses.getName());
            froilan.feeding(horses, 3, new EarCorn(4));
            horses.makeNoise();
        }for(Horse horses: brownHorses){
            froilan.mount(horses);
            System.out.println(horses.getName());
            System.out.println("Horses galloping? " + horses.isGalloping());
            froilan.dismount(horses);
            System.out.println(horses.getName());
            froilan.feeding(horses, 3, new EarCorn(4));
            horses.makeNoise();
        }for(Horse horses: whiteHorses){
            froilan.mount(horses);
            System.out.println(horses.getName());
            System.out.println("Horses galloping? " + horses.isGalloping());
            froilan.dismount(horses);
            System.out.println(horses.getName());
            froilan.feeding(horses, 3, new EarCorn(4));
            horses.makeNoise();
        }

        froilan.isEating((IEdible) new EarCorn(3));
        froilan.isEating((IEdible)new Tomato("Tomato"));
        froilan.isEating((IEdible)new Tomato("Tomato"));

        froilan.isEating((IEdible)new Egg(5, "Sunny Side Up"));

        for(Chicken chicken: brownChickens){
            froilan.feeding(chicken,1, new EarCorn(1));
            System.out.println(chicken.getEgg());
            chicken.egg.isFertilized();
            chicken.egg.setFertilized(true);
            chicken.fertileEgg(chicken.egg);
            System.out.println(chicken.egg.isFertilized());
        }
        System.out.println("----------------MONDAY----------------");
        CropDuster duster = new CropDuster();

        Pilot lady = new Pilot("Froilanda", duster);

        fodana.mount(dusty);
        dusty.fly();


        for(CropRow field1: cropRowArrayList1){
            System.out.println(field1.getCrop());
            lady.cropDuster.makeNoise();
            lady.cropDuster.operateFarm();
            lady.cropDuster.fertilize(cropRowArrayList1);
        }
        System.out.println("Fertilization " +lady.cropDuster.hasBeenFertilized(cropRowArrayList1));
        for(CropRow field1: cropRowArrayList2){
            System.out.println(field1.getCrop());
            lady.cropDuster.makeNoise();
            lady.cropDuster.operateFarm();
            lady.cropDuster.fertilize(cropRowArrayList2);
        }
        System.out.println("Fertilization " +lady.cropDuster.hasBeenFertilized(cropRowArrayList2));
        for(CropRow field1: cropRowArrayList3){
            System.out.println(field1.getCrop());
            lady.cropDuster.makeNoise();
            lady.cropDuster.operateFarm();
            lady.cropDuster.fertilize(cropRowArrayList3);
        }
        System.out.println("Fertilization " +lady.cropDuster.hasBeenFertilized(cropRowArrayList3));
        fodana.dismount(dusty);

        System.out.println("----------------TUESDAY-----------------");
        Tractor greenTractor = new Tractor();





        Farmer dude = new Farmer("Frolan", greenTractor);

        dude.mount(greenTractor);
        greenTractor.operateFarm();


        for(CropRow field1: cropRowArrayList1){
            System.out.println(field1.getCrop());
            dude.tractor.operateFarm();
            dude.tractor.makeNoise();
            dude.tractor.harvest(cropRowArrayList1);
        }
        System.out.println("Harvested " +dude.tractor.hasBeenFertilized(cropRowArrayList1));
        for(CropRow field1: cropRowArrayList2){
            System.out.println(field1.getCrop());
            dude.tractor.operateFarm();
            dude.tractor.makeNoise();
            dude.tractor.harvest(cropRowArrayList2);
        }
        System.out.println("Harvested " +dude.tractor.hasBeenFertilized(cropRowArrayList2));
        for(CropRow field1: cropRowArrayList3){
            System.out.println(field1.getCrop());
            dude.tractor.operateFarm();
            dude.tractor.makeNoise();
            dude.tractor.harvest(cropRowArrayList3);
        }
        System.out.println("Harvested " +dude.tractor.hasBeenFertilized(cropRowArrayList3));
        dude.dismount(greenTractor);
    }

    
}