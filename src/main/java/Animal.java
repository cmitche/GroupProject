public class Animal implements INoiseMaker,IEater{

    @Override
    public void makeNoise() {
        System.out.println("Brrr");
    }

    @Override
    public String isEating() {
        return "Animals eat stuff";
    }
}