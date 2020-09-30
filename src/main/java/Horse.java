
public class Horse{

    private String color;
    private String name;
    private int age;

    public Horse(String color, String name, int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGalloping(){
        return false;
    }

    @Override
    public String toString() {
        return "\n"+ name +" | "+
                "color :" + color +
                " | age: " + age +"\n";
    }
}
