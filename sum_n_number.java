import java.util.Scanner;

class sum_n_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be sum : ");
        int num = sc.nextInt();
        int sum=0;

        for(int i=0;i<=num;i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}