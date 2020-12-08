import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] box = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] connect = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                {120, 100}, {85, 130}, {50, 100}};


        //Connect(connect, graphics);
        Connect(box, graphics);

    }

    private static void Connect(int[][] theArray, Graphics graphics) {

        int parameterA = 0;
        int parameterB = 1;
        int parameterC = 0;
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < theArray.length; i++) {
            parameterC++;
            boolean overFlow = parameterC == theArray.length;
            if (overFlow) {
                parameterC = 0;
            }

            graphics.drawLine(  theArray[i][parameterA],
                                theArray[i][parameterB],
                                theArray[parameterC][parameterA],
                                theArray[parameterC][parameterB]);

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