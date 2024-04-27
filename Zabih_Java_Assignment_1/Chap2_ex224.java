
/*
2.24 (Largest and Smallest Integers) 
Write an application that reads five integers and
determines and prints the largest and smallest 
integers in the group. Use only the programming 
techniques you learned in this chapter.
 */
import java.util.Scanner;

public class Chap2_ex224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            int num = input.nextInt();

            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("The largest integer is: " + largest);
        System.out.println("The smallest integer is: " + smallest);

        input.close();
    }
}
