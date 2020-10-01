import java.util.ArrayList;

public class Monday {

    public static void main(String[] args) {

//        Field field1 = new Field();
//        Field field2 = new Field();
//        Field field3 = new Field();

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

//        field1.setListOfCropRows(cropRowArrayList1);
//        field2.setListOfCropRows(cropRowArrayList2);
//        field3.setListOfCropRows(cropRowArrayList3);

        CropDuster duster = new CropDuster();

        Pilot lady = new Pilot("Froilanda", duster);

        for(CropRow field1: cropRowArrayList1){
            System.out.println(field1.getCrop());
            lady.mount(duster);
            lady.cropDuster.fly();
            lady.cropDuster.makeNoise();

            lady.cropDuster.operateFarm();
            lady.cropDuster.fertilize(cropRowArrayList1);

        }
        System.out.println("Fertilized? " +lady.cropDuster.hasBeenFertilized(cropRowArrayList1));

    }
}
