import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).


        RainbowSquare(20, Color.RED, graphics);


    }

    public static void RainbowSquare(int boxSize, Color starterColor, Graphics graphics) {
        graphics.setColor(starterColor);
        int cordX = (WIDTH - boxSize) / 2;
        int cordY = (HEIGHT - boxSize) / 2;
        graphics.fillRect(cordX, cordY, boxSize, boxSize);

        Color INDIGO = new Color(75, 0, 130);
        Color VIOLET = new Color(238, 130, 238);

        Color[] thecolors = new Color[7];


        thecolors[0] = Color.RED;
        graphics.setColor(starterColor);
        thecolors[1] = Color.ORANGE;
        thecolors[2] = Color.YELLOW;
        thecolors[3] = Color.GREEN;
        thecolors[4] = Color.BLUE;
        thecolors[5] = INDIGO;
        thecolors[6] = VIOLET;


        int x = 6;
        for (int i = boxSize + 1; i < WIDTH; i++) {
            x++;
            boolean overFlow = x == 7;
            if (overFlow) {
                x = 0;
            }
            graphics.setColor(thecolors[x]);

            cordX = (WIDTH - i) / 2;
            cordY = (HEIGHT - i) / 2;
            graphics.drawRect(cordX, cordY, i, i);

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