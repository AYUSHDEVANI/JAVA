// package FUNCTION;

import java.util.Scanner;

class add_two_numbers {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int sum = add(a, b);

        System.out.println("Sum = " + sum);
    }
}