package Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class T1Panel extends JPanel {
    private static int WIDTH, HEIGHT;
    public JButton button1, button2, button3, button4;

    public T1Panel(int width, int height) {
        WIDTH = width;
        HEIGHT = height;
        init();
    }
    private void init(){
        button1 = new JButton("show");
        button2 = new JButton("hide");
        button3 = new JButton("close");
        this.setLayout(new FlowLayout(2,30,0));
        this.add(button1);
        this.add(button2);
        this.add(button3);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
