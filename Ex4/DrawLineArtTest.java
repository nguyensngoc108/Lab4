package Ex4;

import javax.swing.JFrame;

public class DrawLineArtTest {
    public static void main(String[] args) {
        // create a panel that contains our drawing
        DrawLineArt panel = new DrawLineArt();

        // create a new frame to hold the panel
        JFrame app=new JFrame();

        // set the frame to exit when it is closed
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.add(panel);
        app.setSize(300, 340);
        app.setResizable(false);
        app.setVisible(true);

    }
    
}
