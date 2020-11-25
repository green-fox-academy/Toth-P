import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 4; i++) {
            int color1 = (int) (Math.random() * 256);
            int color2 = (int) (Math.random() * 256);
            int color3 = (int) (Math.random() * 256);

            Color myColor = new Color(color1, color2, color3);

            graphics.setColor(myColor);
            int A = (int) ((WIDTH + 1) * Math.random());
            int B = (int) ((HEIGHT + 1) * Math.random());
            int C = (int) ((HEIGHT + 1) * Math.random());
            int D = (int) ((HEIGHT + 1) * Math.random());
            graphics.fillRect(A, B, C, D);


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