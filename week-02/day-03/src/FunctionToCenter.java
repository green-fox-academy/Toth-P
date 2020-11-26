import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.


        FirstLine(60, 80, graphics);

    }

    public static void FirstLine(int cordX, int cordY, Graphics graphics) {
        int boxWidth = WIDTH;
        int boxHeight = HEIGHT;
        boolean box = cordX <= cordY;
        if (box) {
            boxWidth = boxWidth - cordX;
            boxHeight = boxHeight - cordX;
        } else {
            boxWidth = boxWidth - cordY;
            boxHeight = boxHeight - cordY;
        }
        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;


        for (int i = 0; i <= boxHeight; i = i + 20) {
            int lineCordX = cordX + i;
            int lineCordY = cordY + i;
            boolean overFlow = lineCordX > boxHeight;
            boolean overFlow2 = lineCordY > boxWidth;
            if (overFlow) {
             lineCordX = boxHeight;
            }
            if (overFlow2) {
             lineCordY = boxWidth;
            }
            graphics.drawLine(WIDTH - boxWidth, lineCordY, centerX, centerY);
            graphics.drawLine(lineCordX, HEIGHT - boxHeight, centerX, centerY);
            graphics.drawLine(boxWidth, lineCordY, centerX, centerY);
            graphics.drawLine(lineCordX, boxHeight, centerX, centerY);

        }
        graphics.setColor(Color.GREEN);
        graphics.drawLine(cordX, cordY, centerX, centerY);

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