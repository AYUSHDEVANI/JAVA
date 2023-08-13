import java.util.*;

class String_Builder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Ayush");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'a');

        System.out.println(sb);

        sb.insert(2, "E");

        System.out.println(sb);

        sb.delete(2, 3);

        System.out.println(sb);

        sb.append(" ");
        sb.append("D");
        sb.append("E");
        sb.append("V");
        sb.append("A");
        sb.append("N");
        sb.append("I");
        System.out.println(sb);
        System.out.println(sb.length());

        
        


    }
}