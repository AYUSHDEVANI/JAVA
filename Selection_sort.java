import java.util.Scanner;

public class Selection_sort {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of  elements in Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++)
        {
            int small = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        
        System.out.println("Selection sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
