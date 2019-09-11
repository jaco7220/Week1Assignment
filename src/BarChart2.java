
import hsa.Console;
import java.awt.Color;

public class BarChart2 {

    
    public static void main(String[] args) {
        Console c = new Console();
        Bar b1 = new Bar();
        Bar b2 = new Bar();
        Bar b3 = new Bar();
        Bar b4 = new Bar();
        while(true){
            c.print("Enter height of bar 1 (Must be between 0 and 450) > ");
            b1.height = c.readInt();
            if(b1.height>1&&b1.height<=450)
                break;
            else
                c.println("Invalid please try again");
        }
        b1.xloc = 150;
        b1.col = Color.red;
        while(true){
            c.print("Enter height of bar 2 (Must be between 0 and 450) > ");
            b2.height = c.readInt();
            if(b2.height>1&&b2.height<=450)
                break;
            else
                c.println("Invalid please try again");
        }
        b2.xloc = 250;
        b2.col = Color.green;
        while(true){
            c.print("Enter height of bar 3 (Must be between 0 and 450) > ");
            b3.height = c.readInt();
            if(b3.height>1&&b3.height<=450)
                break;
            else
                c.println("Invalid please try again");
        }
        b3.xloc = 350;
        b3.col = Color.blue;
        while(true){
            c.print("Enter height of bar 4 (Must be between 0 and 450) > ");
            b4.height = c.readInt();
            if(b1.height>1&&b4.height<=450)
                break;
            else
                c.println("Invalid please try again");
        }
        b4.xloc = 450;
        b4.col = Color.orange;
        
        c.clear();
        
        //draw the bars
        b1.draw(c);
        b2.draw(c);
        b3.draw(c);
        b4.draw(c);
        c.setColor(Color.black);
        c.drawString("Your graph", 300, 15);
        
    }
    
}
