import java.util.Scanner;

public class else_if {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a : ");
        a = sc.nextInt();

        System.out.print("Enter b : ");
        b = sc.nextInt();

        if(a==b)
        {
            System.out.println("a is equal to b.");
        }
        else if(a<b)
            {
                System.out.println("a is less than b.");
            }
        else {
                System.out.println("a is greter than b.");
            }
        
    }
}
