import java.util.ArrayList;

public class Farmhouse {

    ArrayList<Person> people;

    public Farmhouse(ArrayList<Person> people) {
        this.people = people;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

}
