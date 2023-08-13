import java.util.Scanner;

public class p16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int A[] = new int[n];

        
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter elements : ");
            A[i] = sc.nextInt();
        }
        int add = 0, mean = 0, min = A[0], max =A[0];

        for(int i=0;i<n;i++)
        {
            add += A[i];

            if (min > A[i]) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }

        }
        
        System.out.println("Addition = " + add);
        System.out.println("Mean = " + ((add) / n));
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        
    }
    
}
