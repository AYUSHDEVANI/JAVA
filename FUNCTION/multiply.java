import java.util.Scanner;

class multiply {

    public static int mul(int a,int b) {
        int multi = a * b;
        return multi;   
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int x = sc.nextInt();

        System.out.print("Enter second number : ");
        int y = sc.nextInt();

        int mul = mul(x, y);

        System.out.println("Multiplication = " + mul);
    }
}