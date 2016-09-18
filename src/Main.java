import javax.swing.*;
import java.awt.*;

/**
 * @author V.Vega
 * @author www.artemshylov.net
 */
public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hi");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setBackground(Color.GREEN);
        frame.setLocation(400,400);
    }
}
