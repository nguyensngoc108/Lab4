package Ex6;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class BarChart extends JPanel {

    static int[] arr = new int[5];
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            
            String lenOfBar = JOptionPane.showInputDialog("Enter the length of bar " + (i+1));
            int length = Integer.parseInt(lenOfBar);
            arr[i] = length;
        }

        BarChart panel = new BarChart();
         
         // create a new frame to hold the panel
        JFrame application = new JFrame();
         
         // set the frame to exit when it is closed
         application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
         application.add(panel);  // add the panel to the frame  
         application.setSize(350, 350); // set the size of the frame
         application.setVisible(true); // make the frame visible  
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        
            g.setColor(Color.CYAN);
            g.fillRect(0, 50, arr[0], 30);

            g.setColor(Color.RED);
            g.fillRect(0, 100, arr[1], 30);

            g.setColor(Color.YELLOW);
            g.fillRect(0, 150, arr[2], 30);

            g.setColor(Color.ORANGE);
            g.fillRect(0, 200, arr[3], 30);

            g.setColor(Color.BLUE);
            g.fillRect(0, 250, arr[4], 30);
        
    }
}


