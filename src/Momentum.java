
import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kg,ms;
        System.out.print("Enter the number of kg's: ");
        kg = scan.nextDouble();
        System.out.print("Enter the object's velocity in m/s: ");
        ms = scan.nextDouble();
        System.out.format("The objects momentum is %.2f\n", ms*kg);

    }

}
