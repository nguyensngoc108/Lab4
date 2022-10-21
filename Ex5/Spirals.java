package Ex5;

import java.awt.Graphics;
import javax.swing.JPanel;


public class Spirals extends JPanel {

    public void paintComponent(Graphics g) {

        int x = getSize().width / 2 - 10;
        int y = getSize().height/ 2 - 10;
        int width = 20,height = 20;
        int sA = 0;
        int eA = 180;
        int depth = 10;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, sA, -eA);
            } else {
                x = x - 2 * depth;
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, sA, eA);
            }
        }
    }
}