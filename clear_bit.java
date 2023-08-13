public class clear_bit {
    public static void main(String args[]) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        int newnum = ~(bitMask) & n;
        // ~ etle not thay

        System.out.println("New number is : " + newnum);
    }    
}
