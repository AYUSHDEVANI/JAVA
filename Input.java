import java.util.Scanner;

class Input
{
    public static void main(String args[])
    {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Your name is " + name);
    }
}