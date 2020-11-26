import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MyFox {
    public static void mainDraw(Graphics graphics) {

        int[][] myfox = {{100,100},{80,80},{100,60},{100,20},{120,40},{140,40},{140,100},{120,120},{100,100},
                {60,160},{40,200},{60,240},{140,240},{180,220},{140,200},{140,240},{60,160},{140,200},
                {100,100},{140,140},{140,200},{140,140},{160,120},{140,100},{160,120},{180,100},{140,200},
                {180,100},{200,80},{180,60},
                {180,20},{160,40},{140,40},{140,100},{120,120}};




        Connect(myfox, graphics);

    }

    private static void Connect(int[][] theArray, Graphics graphics) {

        int parameterB = 0;
        int parameterC = 1;
        int parameterD = 0;

        for (int i = 0; i < theArray.length; i++) {
            parameterD++;
            boolean overFlow = parameterD == theArray.length;
            if (overFlow) {
                parameterD = 0;
            }

            graphics.drawLine(  theArray[i][parameterB],
                    theArray[i][parameterC],
                    theArray[parameterD][parameterB],
                    theArray[parameterD][parameterC]);

        }

    }


    // Don't touch the code below
    static int WIDTH = 280;
    static int HEIGHT = 280;

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