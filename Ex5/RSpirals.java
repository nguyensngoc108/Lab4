package Ex5;

import java.awt.Graphics; 
import javax.swing.JPanel;


public class RSpirals extends JPanel
{
    public void paintComponent(Graphics g)
    {
        int width = getSize().width;
        int height = getSize().height;

        int widthCenter = width / 2;
        int heightCenter = height / 2;

        for (int i = 0; i < 4 ; i++)
        {
            g.drawLine(widthCenter + (20 * i), heightCenter - (20 * i), widthCenter + (20 * i), heightCenter + 20 + (20 * i));
            g.drawLine(widthCenter + (20 * i), heightCenter + 20 + (20 * i), widthCenter - 20 - (20 * i), heightCenter + 20 + (20 * i));
            g.drawLine(widthCenter - 20 - (20 * i), heightCenter + 20 + (20 * i), widthCenter - 20 - (20 * i), heightCenter - 20 - (20 * i));
            g.drawLine(widthCenter - 20 - (20 * i), heightCenter - 20 - (20 * i), widthCenter + 20 + (20 * i), heightCenter - 20 - (20 * i));
        }
    }
}