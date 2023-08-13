import java.util.Scanner;

public class switch_case {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        
        switch(num)
        {
            case 1:
                System.out.println("You pressed 1.");
                break;

            case 2:
            {
                System.out.println("You pressed 2.");
                break;
            }
            case 3:
            {
                System.out.println("You pressed 3.");
                break;
            }
            default:
            {
                System.out.println("Enter valid number.");
            }
        }
        
    }
}
