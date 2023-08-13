public class set_bit {
    public static void main(String args[]) {
        int n = 5;//0101
        int pos = 1;
        int bitMask = 1 << pos;//0010

        int newnum = (bitMask | n);//0111
        System.out.println("The number is : " + newnum);
        
    }
    
}
