import java.util.Scanner;

public class recursion_factorial {

    public static int factorial(int n) {
        
        if((n==1)||(n==0))
        {
            return 1;
        }
        
            int fact_n1 = factorial(n - 1);
            int fact = n * fact_n1;
        
        return fact;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial : ");
        int n = sc.nextInt();
        
        int fact = factorial(n);
        
        System.out.println("Factorial = " + fact);
        
        }
}
