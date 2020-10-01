import java.util.ArrayList;

public class CropRow implements IProduce{
    Crop crop;
    private int length;
    ArrayList<CropRow> croplist = new ArrayList<>();

    private boolean getTruth = false;
    private boolean harvested = false;

    public CropRow(){}
    public CropRow(Crop crop, int length){
        this.crop = crop;
        this.length = length;
    }
    public CropRow(ArrayList<CropRow> crops){this.croplist = crops;}


    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "CropRow: " + crop +
                " | length of field: " + length;
    }

    @Override
    public boolean isHarvested() {
        return false;
    }

    @Override
    public boolean getHarvested() {
        return harvested;
    }

    @Override
    public void setHarvested(boolean harvested) {
        this.harvested = harvested;
    }

    @Override
    public boolean isFertilized() {
        return false;
    }


    public boolean getFertilized(){
        return getTruth;
    }

    @Override
    public void setFertilized(boolean fertilized) {
        this.getTruth = fertilized;
    }

    @Override
    public boolean hasBeenHarvested() {
        return false;
    }

    @Override
    public boolean hasBeenHarvested(ArrayList<CropRow> produces) {
        for (IProduce produce: produces){
            if (!produce.getFertilized()){
                return false;
            }
        }
        return true;
    }
    @Override
    public boolean hasBeenFertilized(ArrayList<CropRow> produces) {
        for (IProduce produce: produces){
            if (!produce.getFertilized()){
                return false;
            }
        }
        return true;
    }
}
