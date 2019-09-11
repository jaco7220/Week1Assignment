
import TurtleGraphics.Pen;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Color col[] = {Color.red, Color.blue, Color.green, Color.orange};
        Bar b[] = new PenBar[4];
        for (int i = 0; i < b.length; i++) {
            b[i] = new PenBar();
            while (true) {
                System.out.print("Enter height of bar " + (i + 1) + " (Must be between 0 and 450) > ");
                b[i].height = scan.nextInt();
                if (b[i].height > 1 && b[i].height <= 450) {
                    break;
                } else {
                    System.out.println("Invalid please try again");
                }
            }
            

        }
        
        //draw the bars
        b1.draw(c);
        b2.draw(c);
        b3.draw(c);
        b4.draw(c);
        c.setColor(Color.black);
        c.drawString("Your graph", 300, 15);

    }
    
    public static void makeBar(Pen p, PenBar pb, int x, int y, int h, Color col){
        pb.x = x;
        pb.y = y;
        pb.height = h;
        pb.barColor = col;
        pb.draw(p);
    }

}
