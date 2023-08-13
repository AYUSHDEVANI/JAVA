import java.util.Scanner;


public class recursion_sum {

    public static void printsum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println("Sum = " + sum);
            return;
        }
        else{
            sum+=i;
            printsum(i+1,n,sum);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print sum : ");
        int n = sc.nextInt();
        printsum(1, n, 0);        
    }
    
}
