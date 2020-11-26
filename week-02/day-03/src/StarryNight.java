import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        int starNum = (int) ((Math.random() * 500) + 50);


        for (int i = 0; i < starNum; i++) {
            int randomNum = (int) (Math.random() * 255);
            int randomX = (int) (Math.random() * WIDTH + 1);
            int randomY = (int) (Math.random() * HEIGHT + 1);
            int randomSize = (int) ((Math.random() * 2) + 1);

            Color RANDOMGRAY = new Color(randomNum, randomNum, randomNum);
            graphics.setColor(RANDOMGRAY);
            graphics.fillRect(randomX, randomY, randomSize, randomSize);
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
            this.setBackground(Color.BLACK);
        }
    }
}