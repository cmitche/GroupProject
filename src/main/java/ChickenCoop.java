import java.util.ArrayList;

public class ChickenCoop {
        ArrayList<Chicken> coop = new ArrayList<>();

        public ChickenCoop(){}

        public ChickenCoop(ArrayList<Chicken> coops) {
                this.coop = coops;
        }

        public ArrayList<Chicken> getCoop() {
                return coop;
        }

        public void setCoop(ArrayList<Chicken> coop) {
                this.coop = coop;
        }

        @Override
        public String toString() {
                return "ChickenCoop{" +
                        "coop=" + coop +
                        '}';
        }

}