//Chapter4_ex421
//Find The Largest Number
/* 
1. Initialize counter to 1
2. Initialize largest to the first number entered by the user
3. While counter is less than or equal to 10:
     a. Prompt the user to enter an integer (number)
     b. If number is greater than largest, update largest to number
     c. Increment counter by 1
4. Print the largest number found
*/
import java.util.Scanner;

public class Chap4_ex421 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest = 0;

        while (counter <= 10) {
            System.out.print("Enter integer #" + counter + ": ");
            int number = input.nextInt();
            
            if (counter == 1 || number > largest) {
                largest = number;
            }
            
            counter++;
        }
        System.out.println("The largest number is: " + largest);
        input.close();
    }
}
