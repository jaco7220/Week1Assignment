
import hsa.Console;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

public class BarChart1 {

    
    public static void main(String[] args) {
        Console c = new Console();
        int h1,h2,h3,h4;
        c.print("Enter height of bar 1 > ");
        h1=c.readInt();
        c.setColor(Color.red);
        c.fillRect(150, 500-h1, 50, h1);
        c.drawString("Value: " + h1, 150, 490-h1);
        c.print("Enter height of bar 2 > ");
        h2=c.readInt();
        c.setColor(Color.green);
        c.fillRect(250, 500-h2, 50, h2);
        c.drawString("Value: " + h2, 250, 490-h2);
        c.print("Enter height of bar 3 > ");
        h3=c.readInt();
        c.setColor(Color.blue);
        c.fillRect(350, 500-h3, 50, h3);
        c.drawString("Value: " + h3, 350, 490-h3);
        c.print("Enter height of bar 4 > ");
        h4=c.readInt();
        c.setColor(Color.orange);
        c.fillRect(450, 500-h4, 50, h4);
        c.drawString("Value: " + h4, 450, 490-h4);
        
    }
    
}
