import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {


    public static void mainDraw(Graphics graphics) {
        HEIGHT = WIDTH;
        drawLines(2, 64, graphics);
        drawLines(4, 16, graphics);
        drawLines(8, 4, graphics);

    }


    public static void drawLines(int distance, int divide, Graphics graphics) {
        int size = HEIGHT / (divide / 2);
        int size2 = -size;
        for (int i = 0; i < divide / 2; i++) {
            size2 = size2 + size;

            for (int j = 0; j < HEIGHT; j = j + size) {


                for (int k = 0; k < size; k = k + distance) {
                    graphics.setColor(Color.RED);
                    graphics.drawLine(size2, k + j, (k + size2 + distance), size + j);
                    graphics.setColor(Color.BLUE);
                    graphics.drawLine(k + size2, j, size + size2, k + distance + j);

                }
            }
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