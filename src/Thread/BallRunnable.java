package Thread;

import java.awt.*;

/**
 * Created by jal on 2018/3/4 0004.
 */
public class BallRunnable implements Runnable{
    private Ball ball;
    private Component component;
    public static final int STEPS = 5000,DELAY = 3;
    public BallRunnable(Ball aball, Component aComponent) {
        ball = aball;
        component = aComponent;
    }

    @Override
    public void run() {
        try {
            for(int i = 1; i <= STEPS; i++){
                ball.move(component.getBounds());
                component.repaint();
                Thread.sleep(DELAY);
            }
        }catch (InterruptedException e){

        }
    }
}
