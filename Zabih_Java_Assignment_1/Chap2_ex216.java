

/*  */
import java.util.Scanner;

public class Chap2_ex216 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter the Second integer: ");
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println(num1 + "is Larger");
        }
        else if (num1 < num2){
            System.out.println(num2 + " is larger");
        }
        else{
            System.err.println("These numbers are eqaul");
        }
        input.close();
    }
}