import java.util.Scanner;

public class bubble_sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numbers of elements  : ");
        int n = sc.nextInt();

        int A[] = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }

            }
        }
        System.out.println("Bubble sort : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i] + " ");
        }
        

    }
    
}
