import java.util.Scanner;

public class p18 {
    /**
     * @param args
     */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int sum[][] = new int[3][3];
        int mul[][] = new int[3][3];

        System.out.println("Enter elements of first array : ");
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
            // System.out.println();

        }
        System.out.println("Enter elements of Second array : ");
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
            // System.out.println();
        }
        
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    sum[i][j] = A[i][j] + B[i][j];
                    mul[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("SUM = ");
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("MULTIPLICATION = ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
