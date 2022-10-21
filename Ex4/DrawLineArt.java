package Ex4;
/*
 * Create the design in the left screen capture of Fig. 4. Begin by dividing each edge into an
equal number of increments (we chose 15 again). The first line starts in the top-left corner
and ends one step right on the bottom edge. For each successive line, move down one
increment on the left edge and right one increment on the bottom edge. Continue drawing
lines until you reach the bottom-right corner. The figure should scale as you resize the
window so that the endpoints always touch the edges.
 */

import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawLineArt extends JPanel {
    /*The first line starts in the top-left corner
and ends one step right on the bottom edge. For each successive line, move down one
increment on the left edge and right one increment on the bottom edge. Continue drawing
lines until you reach the bottom-right corner. The figure should scale as you resize the
window so that the endpoints always touch the edges. */
   //Drawing Spirals
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int width=getWidth();
        int height=getHeight();
        int x =0, y =height, c= 0;
        while(c < 15){
     
            g.drawLine(0,x, x, height);

            g.drawLine(width, x , y,height);

            g.drawLine(0, y, x, 0);

            g.drawLine(width, y, y, 0);
            
            x += 20;
            y-=20;
            c++;
        }
        

    
    }
    

}
    

