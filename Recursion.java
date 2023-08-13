public class Recursion {

    public static void printnum(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            printnum(n - 1);
        }
    }
    
    public static void printnum_1to15(int m) {
        if(m==16)
            return;

            else{
                System.out.println(m);
                printnum_1to15(m + 1);
            }
    }
    
    public static void main(String args[]) {
        int n = 5;
        // printnum(n);
        // printnum_1to15(1);

    }
    
}
