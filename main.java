
import java.util.Scanner;

public class main {

    static Scanner User_input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter interger 1: ");
        double input1 = User_input.nextDouble();

        System.out.print("Enter interger 2: ");
        double input2 = User_input.nextDouble();

        System.out.println("Enter choice to perform operation:");
        System.out.println("1 = add\n2 = subtract\n3 = multiply\n4 = divide");
        int input3 = User_input.nextInt();
                
        // creating contructors:
        sum obj = new sum(input1,input2);
        subtract obj2 = new subtract(input1, input2);
        multiply obj3 = new multiply(input1, input2);
        divide obj4 = new divide(input1, input2);

        switch (input3) {
            case 1:
                System.out.println("Additon performed.");
                System.out.println("The result is " + obj.add());
                break;

            case 2:
                // feature added
                System.out.println("Subtraction performed.");
                System.out.println("The result is " + obj2.subtraction());
                break;

            case 3:
                // feature added
                System.out.println("Multiplication performed.");
                System.out.println("The result is " + obj3.multiplication());
                break;

            case 4:
                // feature added
                System.out.println("Division performed.");
                System.out.println("The result is " + obj4.division());
                break;

            default:
                System.out.println("Wrong input..!");
                break;
        }
    }
}
