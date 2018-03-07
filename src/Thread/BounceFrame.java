package Thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jal on 2018/3/4 0004.
 */
public class BounceFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 450,DEFAULT_HEIGHT = 350,STEPS = 1000,DELAY = 3;
    private BallPanel panel;

    public BounceFrame(){
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        setTitle("Bounce");

        panel = new BallPanel();
        add(panel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel,"Start",new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                addBall();
            }
        });
        addButton(buttonPanel, "Close", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(buttonPanel,BorderLayout.SOUTH);
    }

    private void addButton(Container c, String title, ActionListener listener) {
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    private void addBall() {

        Ball ball = new Ball();
        panel.add(ball);
        Runnable r = new BallRunnable(ball,panel);
        Thread t = new Thread(r);
        t.start();
    }
}
