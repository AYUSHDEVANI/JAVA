import java.util.Scanner;

public class Check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        float n = sc.nextFloat();

        if (n > 0) {
            System.out.println("Number is positive ...");
        }
        else if (n < 0) {
            System.out.println("Number is negative...");
        }
        else {
            System.out.println("Number is zero..");
        }
    }
    
}
