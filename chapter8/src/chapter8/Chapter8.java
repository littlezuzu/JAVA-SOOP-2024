/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter8;

/**
 *
 * @author zurei
 */
/*import java.awt.*;
import javax.swing.*;
public class Chapter8 extends JPanel{

    /**
     * @param args the command line arguments
     
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 24));
        g.drawString("BUNGA BUNGA CINTA by aina", 10, 20);
        
        g.setColor(Color.RED);
        g.drawLine(5, 30, 380, 30);
        
         // Drawing flower petals
        g.setColor(Color.PINK);
        int[] petalX = {200, 230, 200, 170};
        int[] petalY = {150, 200, 250, 200};
        for (int i = 0; i < 4; i++) {
            g.fillArc(petalX[i] - 50, petalY[i] - 50, 100, 100, 0, 360);
        }
        
        
        // Drawing flower center
        g.setColor(Color.YELLOW);
        g.fillArc(175, 175, 50, 50, 0, 360);

        // Drawing stem
        g.setColor(Color.GREEN);
        g.drawLine(200, 225, 200, 350);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Chapter8 panel = new Chapter8();
        frame.add(panel);

        frame.setVisible(true);
        // TODO code application logic here
    }
    
}*/

/*import java.awt.*;
import javax.swing.*;

public class Chapter8 extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Title text
        g.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 24));
        g.drawString("POKOK CUCUK LANGIT ", 10, 20);
        
        // Title underline
        g.setColor(Color.RED);
        g.drawLine(5, 30, 380, 30);
        
        // Drawing tree trunk
        g.setColor(new Color(139, 69, 19)); // Brown color for trunk
        g.fillRect(180, 200, 40, 150); // Trunk position and size
        
        // Drawing tree canopy
        g.setColor(Color.GREEN);
        int[] canopyX = {200, 130, 270};
        int[] canopyY = {100, 200, 200};
        g.fillPolygon(canopyX, canopyY, 3); // Draw a triangle as the canopy

        // Drawing tree leaves as circles to enhance the canopy
        g.setColor(new Color(34, 139, 34)); // Darker green for leaves
        g.fillOval(130, 80, 50, 50);
        g.fillOval(160, 60, 80, 80);
        g.fillOval(220, 80, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Chapter8 panel = new Chapter8();
        frame.add(panel);

        frame.setVisible(true);
    }
}*/

import java.awt.*;
import javax.swing.*;

public class Chapter8 extends JPanel {

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g) {
        super.paint(g);

        // Setting font for text
        g.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 24));
        g.drawString("BADMINTON RACKET by Aina", 10, 20);

        // Drawing the handle of the racket
        g.setColor(new Color(139, 69, 19)); // Brown color for the handle
        g.fillRect(180, 250, 20, 100); // Handle (a long rectangle)

        // Drawing the frame of the racket (the head of the racket)
        g.setColor(Color.BLACK); // Black color for the frame
        g.drawOval(150, 100, 100, 150); // Frame (an oval shape)

        // Drawing the strings of the racket (grid pattern)
        g.setColor(Color.BLACK); // Color for the strings

        // Vertical strings (drawn with lines)
        for (int i = 160; i <= 240; i += 10) {
            g.drawLine(i, 100, i, 250); // Vertical lines
        }

        // Horizontal strings (drawn with lines)
        for (int j = 110; j <= 240; j += 10) {
            g.drawLine(150, j, 250, j); // Horizontal lines
        }

        // Optional: Drawing the ground (green area beneath the racket)
        g.setColor(Color.GREEN);
        g.fillRect(0, 350, 400, 50); // Ground
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Chapter8 panel = new Chapter8();
        frame.add(panel);

        frame.setVisible(true);
    }
}
