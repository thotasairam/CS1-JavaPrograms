/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

import javax.swing.*;
import javax.swing.plaf.ColorChooserUI;
import java.awt.*;

public class myComponent extends JComponent {

    int rectX = 200, rectY = 135;
    int ovalX = 200, ovalY = 135;

    boolean rectangleToggle1;
    boolean ovalToggle1;
    boolean specialToggle1;
    int specialCounter = 0;


    public myComponent(boolean rect, boolean oval, boolean special){

        rectangleToggle1 = rect;
        ovalToggle1 = oval;
        specialToggle1 = special;
        setBounds(0,65, 800,800);
        paintComponents(super.getGraphics());

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        if(specialToggle1){

            if(specialCounter%2 == 0){

                g.setColor(new Color(239, 109, 0, 121));

                g.fillOval(50,0,700,700);

                specialCounter++;

            }
            else{

                g.setColor(new Color(0, 149,239, 121));

                g.fillRect(50,0,700,700);

                specialCounter++;

            }
        }else if (ovalToggle1) {

            g.setColor(new Color(239, 153, 23));

            g.fillOval(ovalX, ovalY, 400, 400);
        }
        else if (rectangleToggle1) {

            g.setColor(new Color(134,185,239));

            g.fillRect(rectX, rectY, 400,400);

        }
    }

    void moveRight(){

        if(rectangleToggle1){
            rectX = rectX + 10;
            System.out.println("rectX = "+rectX);
            repaint();

        }

        if(ovalToggle1){
            ovalX = ovalX + 10;
            System.out.println("ovalX = "+ ovalX);
            repaint();

        }
    }

    void moveLeft() {
        if(rectangleToggle1){
            rectX = rectX - 10;
            System.out.println("rectX = " + rectX);
            repaint();

        }

        if(ovalToggle1){
            ovalX = ovalX - 10;
            System.out.println("ovalX = " + ovalX);
            repaint();
        }
    }

    void moveDown() {
        if(rectangleToggle1){
            rectY = rectY + 10;
            System.out.println("rectY = " + rectY);
            repaint();
        }

        if(ovalToggle1){
            ovalY = ovalY + 10;
            System.out.println("ovalY = "+ovalY);
            repaint();
        }
    }

    void moveUp() {
        if(rectangleToggle1){
            rectY = rectY - 10;
            System.out.println("rectY = "+rectY);
            repaint();
        }

        if(ovalToggle1){
            ovalY = ovalY - 10;
            System.out.println("ovalY = "+ovalY);
            repaint();
        }
    }
}
