import java.util.ArrayList;

public class ChickenCoop {
<<<<<<< HEAD
        ArrayList<Chicken> coop = new ArrayList<>();

        public ChickenCoop(){}

        public ChickenCoop(ArrayList<Chicken> coops) {
                this.coop = coops;
=======
        ArrayList<Chicken>coop = new ArrayList<>();

        public ChickenCoop(){}

        public ChickenCoop(ArrayList<Chicken> chickens) {
                this.coop = chickens;
>>>>>>> daee5edc0156e15bb77d6540f3adf798e537f570
        }

        public ArrayList<Chicken> getCoop() {
                return coop;
        }

<<<<<<< HEAD
        public void setCoop(ArrayList<Chicken> coops) {
                this.coop = coops;
        }

        @Override
        public String toString() {
                return ""+ coop;
=======
        public void setCoop(ArrayList<Chicken> chickens) {
                coop = chickens;
>>>>>>> daee5edc0156e15bb77d6540f3adf798e537f570
        }
}
