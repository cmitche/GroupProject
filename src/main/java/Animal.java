public class Animal implements INoiseMaker,IEater{

    @Override
    public void makeNoise() {

        return "Animals make noise";
    }

    @Override
    public String isEating() {
        return "Animals eat stuff";
    }
}