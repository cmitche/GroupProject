import java.util.ArrayList;

public class CropRow{
    Crop crop;
    private int length;

    public CropRow(Crop crop, int length){
        this.crop = crop;
        this.length = length;
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
        return "CropRow "+ +1 +":"+""+ crop +
                " | length of field: " + length;
    }
}
