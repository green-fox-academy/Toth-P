import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics) {
        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        for (int i = 0; i < 3; i++) {
            int size = (int) (Math.random() * 320);
            toCenter(graphics, size);
        }
    }

    public static void toCenter(Graphics graphics, int squareSize) {
        int cordX = (WIDTH - squareSize) / 2;
        int cordY = (HEIGHT - squareSize) / 2;
        graphics.drawRect(cordX, cordY, squareSize, squareSize);

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