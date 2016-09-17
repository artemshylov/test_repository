import human.Human;

/**
 * @author V.Vega
 * @author www.artemshylov.net
 */
public class Main {
    public static void main(String[] args) {
        Crew newCrew = new Crew(new Human(24,"Vincent Vega"), new Human(25,"Elise"), "Rainbow6");
        System.out.println(newCrew.toString());
        System.out.println("asdasdasdd");
    }
}
