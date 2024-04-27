/* Write an application that inputs three integers 
   from the user and displays the sum, average, 
   product, smallest and largest of the numbers.
*/
import java.util.Scanner;
public class Chap2_ex217 {

     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = input.nextInt();

        System.out.println("Enter the Second number");
        int num2 = input.nextInt();

        System.out.println("Enter the Third number");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = num1 + num2 + num3 /3;
        int product = num1 * num2 * num3;
        int smalest = Math.min(Math.min(num1, num2), num3);
        int largest = Math.max(Math.max(num1, num2), num3);

        System.out.printf("the sum of three numbers is %d\n", sum);
        System.out.printf("the prouduct is %d\n", product);
        System.out.printf("the average is %d\n", average);
        System.out.printf("the smalest is %d\n", smalest);
        System.out.printf("the smalest is %d\n", largest);

        input.close();
    }
}