import java.util.Scanner;

public class String_input {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String name = sc.nextLine();

        System.out.println("Your name is : " + name);
    }
}
