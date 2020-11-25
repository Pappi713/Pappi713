import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much squares do you want to draw?");
        int squareNumber = scanner.nextInt();
        int xPos = 10;
        int yPos = 10;
        int size = 15;
        Color Purple = new Color(128, 0, 128);
        graphics.setColor(Purple);
        for (int i = 0; i < squareNumber; i++) {
            graphics.fillRect(xPos, yPos, size, size);
            xPos += size;
            yPos += size;
            size = (int) (size * 1.5);
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
