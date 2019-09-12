
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    public static void main(String[] args) {
        int y=225;
        Scanner s = new Scanner(System.in);
        Pen p = new StandardPen(new SketchPadWindow(800, 600));
        Color col[] = {Color.red, Color.blue, Color.green, Color.orange};
        PenBar pb[] = new PenBar[4];
        for (int i = 0; i < pb.length; i++) {
            pb[i] = new PenBar();
            pb[i].yloc=y;
            y-=100;
            while (true) {
                System.out.print("Enter height of bar " + (i + 1) + " (Must be between 0 and 750) > ");
                pb[i].height = s.nextInt();
                if (pb[i].height > 1 && pb[i].height <= 750) {
                    break;
                } else {
                    System.out.println("Invalid please try again");
                }
            }
            makeBar(p, pb[i], pb[i].yloc, pb[i].height, col[i]);
            pb[i].draw(p);
            

        }

    }
    
    public static void makeBar(Pen p, PenBar pb, int y, int h, Color col){
        pb.yloc = y;
        pb.height = h;
        pb.col = col;
        pb.draw(p);
    }

}
