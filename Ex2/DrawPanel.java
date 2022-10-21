package Ex2;
//  Using drawLine to connect the corners of a panel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    // draws an X from the corners of the panel
    public void paintComponent(Graphics g)
    {
        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        int width = getWidth(); // total width
        int height = getHeight(); // total height

        // draw a line from the upper-left to the lower-right
        g.drawLine(0, 0, width, height);

        // draw a line from the upper-center to the lower-center;
        g.drawLine(width / 2, 0, width / 2, height);

        // draw a line from the left-center to the right-center;
        g.drawLine(0, height / 2, width, height / 2);

        
        
        // draw a line from the lower-left to the upper-right
        g.drawLine(0, height, width, 0);
    }
} 