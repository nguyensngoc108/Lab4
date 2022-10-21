package Ex5;

import javax.swing.JFrame;
public class RSpiralsTest {
    public static void main(String[] args)
    {
        RSpirals panel = new RSpirals();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);      
        application.setSize(300, 300); 
        application.setVisible(true);     
    }
}
