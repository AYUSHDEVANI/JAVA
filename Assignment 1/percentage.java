import java.util.Scanner;

public class percentage {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first subject mark : ");
        float a = sc.nextFloat();

        System.out.print("Enter second subject mark : ");
        float b = sc.nextFloat();

        System.out.print("Enter third subject mark : ");
        float c = sc.nextFloat();

        System.out.print("Enter fourth subject mark : ");
        float d = sc.nextFloat();

        System.out.print("Enter fivth subject mark : ");
        float e = sc.nextFloat();

        System.out.print("Enter sixth subject mark : ");
        float f = sc.nextFloat();

        System.out.println("Percentage = " + ((a + b + c + d + e + f) / 6));
    }
    
}
