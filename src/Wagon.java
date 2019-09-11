
import hsa.Console;
import java.awt.Color;


public class Wagon {

    
    public static void main(String[] args) {
        Console c = new Console();
        c.setColor(Color.cyan);
        c.fillRect(0, 0, 1000, 1000);
        c.setColor(Color.green);
        c.fillRect(0, 450, 1000, 1000);
        c.setColor(Color.red);
        c.fillRect(150, 300, 350, 125);
        c.setColor(Color.yellow);
        c.fillOval(500, 50, 100, 100);
        c.setColor(Color.black);
        c.fillOval(200, 400, 50, 50);
        c.fillOval(400, 400, 50, 50);
        c.drawLine(150, 300, 50, 200);
        
    }
    
}
