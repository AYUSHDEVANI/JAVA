import java.util.Scanner;

public class Input_Sum {
    public static void main(String args[])
    {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = sc.nextInt();

        System.out.print("Enter b : ");
        b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

    }
}
