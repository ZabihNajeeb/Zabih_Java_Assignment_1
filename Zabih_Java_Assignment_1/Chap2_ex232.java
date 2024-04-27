/*
2.32 (Negative, Positive and Zero Values) 
* Write a program that inputs five numbers and 
* determines and prints the number of negative numbers input, 
* the number of positive numbers input and the number of zeros input.
*/

import java.util.Scanner;
public class Chap2_ex232 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integers number:");
        int num = input.nextInt();

        int positive, neigative  = 0;

      if (num > 0){
        positive = num;
        System.out.println("this is positive number: " + positive);
        } else if (num < 0){
            neigative = num;
            System.out.println("this is negative number:" + neigative);
        }else {
            System.out.println("This is Zero number");
        }
        input.close();
    }
}
