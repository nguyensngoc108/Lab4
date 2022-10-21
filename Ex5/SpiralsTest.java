package Ex5;

import javax.swing.JFrame;

public class SpiralsTest {
    public static void main(String[] args) {
        Spirals panel = new Spirals();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(200, 200);
        application.setVisible(true);
    }
}
