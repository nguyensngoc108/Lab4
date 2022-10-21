package Ex3;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLine extends JPanel {
    // draws lines from corners of the panel
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width=0;
        int height=300;
        for(int i=0;i<14;i++){
            width +=20;
            height -=20;
            g.drawLine(0,0,width,height);
        }
        //Line fans out from 4 corners
        width=0;
        height=300;
        for(int i=0;i<14;i++){
            width +=20;
            height -=20;
            g.drawLine(300,0,300-width,height);
            g.drawLine(0,300,width,300-height);
            g.drawLine(300,300,300-width,300-height);
        }
    }
}

