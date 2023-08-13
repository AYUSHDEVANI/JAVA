import java.util.Scanner;

public class SimpleCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a = sc.nextDouble();

        System.out.print("Enter second number : ");
        double b = sc.nextDouble();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplex = " + (a * b));
        System.out.println("Divide = " + (a / b));
        System.out.println("Modulas = " + (a % b));
    }
    
}
