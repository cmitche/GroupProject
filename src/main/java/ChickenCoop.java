import java.util.ArrayList;

public class ChickenCoop {
        ArrayList<Chicken>coop = new ArrayList<>();

        public ChickenCoop(){}

        public ChickenCoop(ArrayList<Chicken> chickens) {
                this.coop = chickens;
        }

        public ArrayList<Chicken> getCoop() {
                return coop;
        }

        public void setCoop(ArrayList<Chicken> chickens) {
                coop = chickens;
        }
}
