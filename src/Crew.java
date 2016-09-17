import human.*;

public class Crew {
    private Human driver;
    private Human navigator;
    String name;

    Crew(Human driver, Human navigator, String name){
        this.driver = driver;
        this.navigator = navigator;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Crew name: " + name + ", driver: " + driver.toString() + "; navigator: " + navigator.toString();
    }
}

