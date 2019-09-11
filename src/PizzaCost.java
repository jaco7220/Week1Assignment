
import java.util.Scanner;

public class PizzaCost {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cost = 2.25;
        System.out.print("Enter the size of the pizza in inches: ");
        cost += scan.nextDouble()*0.5;
        System.out.print("Enter the number of toppings: ");
        cost += scan.nextDouble()*0.75;
        System.out.format("The cost of the pizza will be %.2f\n", cost);
    }
    
}
