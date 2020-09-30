public class Animal implements INoiseMaker,IEater{

    @Override
    public String makeNoise() {

        return "Animals make noise";
    }

    @Override
    public String isEating() {
        return "Animals eat stuff";
    }
}