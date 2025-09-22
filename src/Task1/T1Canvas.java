package Task1;

import javax.swing.*;
import java.awt.*;

public class T1Canvas extends JPanel {
    private static int WIDTH, HEIGHT;
    private static int radiusWheel = 100;
    private static int roadHeight;

    public T1Canvas(int width, int height) {
        WIDTH = width;
        HEIGHT = height;
        roadHeight = height * 5 / 6;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintMyComponent(g);
    }

    public void paintMyComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.GRAY);
        g.fillRect(0, roadHeight, WIDTH, roadHeight);

        g.setColor(Color.BLACK);
        g.fillOval(120, roadHeight - 50, radiusWheel, radiusWheel);
        g.fillOval(430, roadHeight - 50, radiusWheel, radiusWheel);

        g.setColor(Color.WHITE);
        g.fillOval(159, roadHeight - 15, radiusWheel / 4, radiusWheel / 4);
        g.fillOval(469, roadHeight - 15, radiusWheel / 4, radiusWheel / 4);

        g.setColor(new Color(247, 161, 62));
        g.fillArc(330,roadHeight-170,50,100,0,130);
        //g.fillRoundRect(330,roadHeight-170,35,70,20,20);


        g.setColor(new Color(100, 100, 100));
        g.fillRoundRect(80, roadHeight - 120, 500, 100, 10, 10);
        g.setColor(new Color(20, 20, 100));

        g2.setStroke(new BasicStroke(10));
        g2.drawLine(500, roadHeight - 120, 480, roadHeight - 200);

        g.setColor(new Color(255, 180, 180));
        g.fillRect(80, roadHeight - 60, 500, 3);
        g.fillRect(80, roadHeight - 50, 500, 3);
        g.fillRect(80, roadHeight - 40, 500, 3);

        g.setColor(new Color(40, 40, 40));
        g.fillRect(500, roadHeight - 100, 80, 3);
        g.fillRect(500, roadHeight - 120, 3, 20);
        g.fillRect(80, roadHeight - 100, 80, 3);
        g.fillRect(160, roadHeight - 120, 3, 20);
        g2.setStroke(new BasicStroke(3));
        g.drawLine(500,roadHeight - 120, 440, roadHeight-40);
        g.drawLine(440,roadHeight - 40, 300, roadHeight-40);
        g.drawLine(300,roadHeight - 40, 300, roadHeight-120);
        g.drawRect(305,roadHeight - 100, 17, 8);

        g.setColor(Color.YELLOW);
        g.fillPolygon(new int[]{580,570,590},new int[]{roadHeight-120,roadHeight-130,roadHeight-130},3);

        g.setColor(Color.YELLOW);
        g.fillRoundRect(570, roadHeight - 100, 20, 20, 10, 10);
        g.setColor(Color.RED);
        g.fillRoundRect(570, roadHeight - 80, 20, 20, 10, 10);

        g.setColor(Color.YELLOW);
        g.fillRoundRect(70, roadHeight - 100, 20, 20, 10, 10);
        g.setColor(Color.RED);
        g.fillRoundRect(70, roadHeight - 80, 20, 20, 10, 10);

        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.drawString("Car",400,roadHeight - 100);
        g.drawString("Super",200,roadHeight - 100);
        g.drawString("Duper",200,roadHeight - 80);
        g.drawString("Mega",200,roadHeight - 60);

    }
}
