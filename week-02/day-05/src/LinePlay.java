import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {



    public static void mainDraw(Graphics graphics) {
        HEIGHT=WIDTH;
        drawLines(20, graphics);

    }


    public static void drawLines(int distance, Graphics graphics) {
int size= HEIGHT;
        for (int i = 0; i < size; i = i + distance) {
            graphics.setColor(Color.RED);
            graphics.drawLine(0, i, i + distance, size);
            graphics.setColor(Color.BLUE);
            graphics.drawLine(i, 0, size ,i + distance);

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