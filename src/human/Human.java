package human;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", " + age + "";
    }
}
