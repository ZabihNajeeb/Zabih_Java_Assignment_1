/*  
* the result of this Excersise calculates squares of numbers from 1 to 10 and 
* also sum all number and print the Square and Total at the end 
*/
public class Chap4_ex416 {
    public static void main(String[] args) {
        int x = 1;
        int total = 0;

        while (x <= 10) {
            int y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }

        System.out.printf("Total is %d%n", total);
    }
}
