import java.util.Scanner;

public class Update_bit {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the operation : ");
        int oper=sc.nextInt();
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if(oper==1)
        {
            int newNumber = bitMask | n;
            System.out.println("New number is : " + newNumber);
        }
        else {
            int newNumber = ~(bitMas k) & n;
             System.out.println("New number is : " + newNumber);
        }
    }
    
}
