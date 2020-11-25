import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

    public static void mainDraw(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center.


        int middleX = WIDTH / 2 - 5;
        int middleY = HEIGHT / 2 - 5;
        graphics.setColor(Color.GREEN);
        graphics.fillRect(middleX, middleY, 10, 10);


        graphics.setColor(Color.BLACK);
        graphics.drawLine(0, 0, 320, 0);

        graphics.drawLine(320, 0, 320, 320);

        graphics.drawLine(320, 320, 0, 320);

        graphics.drawLine(0, 320, 0, 0);

        graphics.drawLine(160, 0, 160, 320);

        graphics.drawLine(0, 160, 320, 160);


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
            this.setBackground(Color.RED);
        }
    }
}