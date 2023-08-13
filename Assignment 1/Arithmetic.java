

public class Arithmetic {
    public static void main(String args[]) {
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[2]);

        switch (args[1]) {
            case "+":
                System.out.println("Addition = " + (a + b));
                break;
            
            case "-":
            System.out.println("Subtraction = "+(a-b));
            break;

        case "X":
            System.out.println("Multiplex = " + (a * b));
            break;

        case "/":
            System.out.println("Divide = " + (a / b));
            break;

        case "%":
            System.out.println("Modulas = " + (a % b));
            break;

        default:
            System.out.println("Invalid input..");

        }

        
    }
    
}
