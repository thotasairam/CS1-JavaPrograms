/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */
import javafx.scene.layout.Border;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.Buffer;

public class myGUIApp extends JFrame implements KeyListener, ActionListener{


    JButton ovalButton;

    JButton rectangleButton;

    JButton specialButton;

    JPanel centerPanel;

    JLabel centerLabel;



    boolean ovalToggle = false;
    boolean rectangleToggle = false;
    boolean specialToggle = false;

    myComponent oval = new myComponent(rectangleToggle, true,specialToggle);
    myComponent rectangle = new myComponent(true, ovalToggle, specialToggle);
    myComponent special = new myComponent(rectangleToggle, ovalToggle, true);

    public myGUIApp(String s) {

        setSize(800,800);

        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle(s);

        ovalButton = new JButton("Oval");

        rectangleButton = new JButton("Rectangle");

        specialButton = new JButton("Special");

        Font buttonFont = new Font(Font.SERIF, Font.BOLD, 24);

        Container contentPane = this.getContentPane();

        contentPane.setLayout(new BorderLayout());

        //Button Size

        ovalButton.setBounds(0,0,266,65);

        specialButton.setBounds(266,0,266,65);

        rectangleButton.setBounds(534,0,266,65);

        ovalButton.setForeground(new Color(239, 96, 0));
        rectangleButton.setForeground(new Color(24, 4,239));
        specialButton.setForeground(new Color(239, 34, 64));

        //Font and place of buttons

        specialButton.setFont(buttonFont);

        add(specialButton);

        rectangleButton.setFont(buttonFont);

        add(rectangleButton);

        ovalButton.setFont(buttonFont);

        add(ovalButton);

        centerPanel = new JPanel();

        centerPanel.setLayout(new BorderLayout());


        contentPane.add(centerPanel, BorderLayout.CENTER);

        //Name Label

        Font bigLabelFont = new Font(Font.SANS_SERIF, Font.ITALIC, 48);

        centerLabel = new JLabel("Sai Ram Thota");

        centerLabel.setFont(bigLabelFont);

        centerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        centerPanel.add(centerLabel);
        centerPanel.setBounds(0,75,800,750);

        //ActionListeners

        ovalButton.addActionListener(this);

        specialButton.addActionListener(this);

        rectangleButton.addActionListener(this);

        centerPanel.setBackground(Color.black);

        repaint();

    }


    public static void main(String[] args)
    {

        myGUIApp myApp = new myGUIApp("Sai Ram Thota | Program 8");

        myApp.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){

            if(!rectangleToggle){
                rectangle.moveRight();
            }

            if(!ovalToggle){
                oval.moveRight();
            }

        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT){

            if(!rectangleToggle){
                rectangle.moveLeft();
            }

            if(!ovalToggle){
                oval.moveLeft();
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){

            if(!rectangleToggle){
                rectangle.moveDown();
            }

            if(!ovalToggle){
                oval.moveDown();
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_UP){

            if(!rectangleToggle){
                rectangle.moveUp();
            }

            if(!ovalToggle){
                oval.moveUp();
            }
        }
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {



        Object source = e.getSource();

        String command = e.getActionCommand();
        System.out.println(command);

        if(source == ovalButton)
        {
            if(ovalToggle) {

                ovalButton.addKeyListener(this);
                ovalButton.setFocusable(true);
                centerPanel.add(oval);
                ovalToggle = false;
                repaint();
            }
            else {
                ovalToggle = true;
                centerPanel.remove(oval);
                oval.ovalX = 200;
                oval.ovalY = 135;
                repaint();
            }
        }
        else if (source == rectangleButton)
        {
            if(rectangleToggle) {

                rectangleButton.addKeyListener(this);
                rectangleButton.setFocusable(true);
                centerPanel.add(rectangle);
                rectangleToggle = false;
                repaint();

            }
            else {
                rectangleToggle = true;
                centerPanel.remove(rectangle);
                rectangle.rectX = 200;
                rectangle.rectY = 135;
                repaint();
            }
        }
        else if(source == specialButton)
        {
            if(specialToggle){
                centerPanel.add(special);
                specialToggle = false;
                repaint();
            }
            else{
                specialToggle = true;
                centerPanel.remove(special);
                repaint();

            }
        }
    }
}

