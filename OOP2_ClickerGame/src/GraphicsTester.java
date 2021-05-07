
import javax.swing.*;

public class GraphicsTester {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Testing Graphics");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.getContentPane().add(new Clicker());
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
