import java.util.ArrayList;

public class CropRow implements IProduce{
    Crop crop;
    private int length;

    private boolean getTruth;

    public CropRow(Crop crop, int length){
        this.crop = crop;
        this.length = length;
        this.getTruth = false;
    }

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
    public void setHarvested(boolean harvested) {

    }

    @Override
    public boolean isFertilized() {
        return false;
    }

    @Override
    public boolean fertilize(ArrayList<CropRow> row) {
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
    public boolean hasBeenFertilized(IProduce a) {
        return false;
    }

}
