import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            int factorial = 1;
            for (int i = n; i >= 1; i--) {
                factorial = factorial * i;
            }
            return factorial;
            // return n*fact(n-1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of factorial : ");
        int num = sc.nextInt();

        int factorial = fact(num);

        System.out.println("Factorial = " + factorial);
    }
}
