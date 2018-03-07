package Thread;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by jal on 2018/3/4 0004.
 */
public class Ball {
    private static final int XSIZE = 15,YSIZE = 15;
    private double x = 0, y = 0, dx = 1,dy = 1;
    public void move(Rectangle2D bounds){
        x += dx;
        y += dy;
        if(x < bounds.getMinX()){
            x = bounds.getMinX();
            dx = -dx;
        }
        if(x + XSIZE >= bounds.getMaxX()){
            x = bounds.getMaxX() - XSIZE;
            dx = -dx;
        }
        if(y < bounds.getMinY()){
            y = bounds.getMinY();
            dy =-dy;
        }
        if(y + YSIZE>bounds.getMaxY()){
            y = bounds.getMaxY() - YSIZE;
            dy = -dy;
        }
    }

    public Ellipse2D getShape(){
        return new Ellipse2D.Double(x,y,XSIZE,YSIZE);
    }
}
