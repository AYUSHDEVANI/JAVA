import java.util.Scanner;

public class p17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();

        int A[] = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element : ");
            A[i] = sc.nextInt();

        }
        
        System.out.print("Enter a element to be search : ");
        int num = sc.nextInt();
        int flag = 0;

        for(int i=0;i<n;i++)
        {
            if (num == A[i]) {
                flag = 1;
                System.out.println("The element is found on index is : " + i);
                break;
            }

        }
        if(flag==0)
        {
            System.out.println("Element is not found..");
        }
    }
    
}
