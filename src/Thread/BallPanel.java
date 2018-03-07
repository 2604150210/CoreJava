package Thread;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by jal on 2018/3/4 0004.
 */
public class BallPanel extends JPanel {
    private ArrayList<Ball> balls = new ArrayList<Ball>();

    public void add(Ball b){
        balls.add(b);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        for(Ball b : balls){
            g2.fill(b.getShape());
        }
    }
}
