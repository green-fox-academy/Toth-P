import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

       Steps(10,graphics);

    }

    public static void Steps(int BaseSize, Graphics graphics) {

        int cordX=BaseSize;
        int cordY=BaseSize;
        int width=BaseSize;
        int height=BaseSize;
        Color PURPLE = new Color(128,0,128);

        for (int i = 0; i <6 ; i++) {


            graphics.setColor(Color.BLACK);
            graphics.fillRect(cordX,cordY,width, height);

            graphics.setColor(PURPLE);
            graphics.fillRect(cordX+1,cordY+1,width-2, height-2);

            cordX=cordX+width;
            cordY=cordY+height;
            width=width+BaseSize;
            height=height+BaseSize;
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}