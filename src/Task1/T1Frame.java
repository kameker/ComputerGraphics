package Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class T1Frame extends JFrame {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;
    public T1Frame() {
        T1Canvas t1Canvas = new T1Canvas(WIDTH, HEIGHT);
        T1Panel t1Panel =new T1Panel(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        add(t1Canvas);
        t1Canvas.setVisible(false);
        setVisible(true);
        add(t1Panel, BorderLayout.SOUTH);
        t1Panel.button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1Canvas.setVisible(true);
            }
        } );
        t1Panel.button2.addActionListener(e -> {
            // Code to be executed when the button is clicked
            t1Canvas.setVisible(false);
        });
        t1Panel.button3.addActionListener(new CustomButtonListener());
    }
}
class CustomButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        // Code to be executed when the button is clicked
        System.exit(0);
    }
}