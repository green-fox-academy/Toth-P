import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        ChessBoard(40, graphics);
    }

    public static void ChessBoard(int Size, Graphics graphics) {

        int width = Size;
        int height = Size;

        int cordX = 0;
        int cordX2 = width;
        int cordY = -(height * 2);
        int cordY2 = -height;
        graphics.setColor(Color.BLACK);
        graphics.drawLine(0, 0, 320, 0);
        graphics.drawLine(320, 0, 320, 320);
        graphics.drawLine(320, 320, 0, 320);
        graphics.drawLine(0, 320, 0, 0);

        for (int k = 0; k <= HEIGHT / (height * 2) - 1; k++) {

            cordY = cordY + (height * 2);
            cordY2 = cordY2 + (height * 2);
            cordX = 0;
            cordX2 = width;

            for (int i = 0; i <= WIDTH / (width * 2) - 1; i++) {
                graphics.fillRect(cordX, cordY, width, height);
                cordX = cordX + (width * 2);

                for (int j = 0; j < 1; j++) {
                    graphics.fillRect(cordX2, cordY2, width, height);
                    cordX2 = cordX2 + (width * 2);

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