
import java.awt.Color;
import TurtleGraphics.Pen;


public class PenBar {
    int yloc, height;
    Color col;
    
    public void draw(Pen p){
        p.up();
        p.setColor(col);
        p.setWidth(50);
        p.move(-400, yloc);
        p.setDirection(0);
        p.down();
        p.move(height);
        p.up();
        p.move(30);
        p.drawString("Value: " + height);
    }
}
