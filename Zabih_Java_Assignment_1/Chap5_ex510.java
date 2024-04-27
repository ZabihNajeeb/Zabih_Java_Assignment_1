//This program print the symbols of '@' 10 times 5 in each columns 
// it use nsted loop that one for loop inside another loop
public class Chap5_ex510 {
    public static void main(String[] args) {
       for (int i = 1; i <= 10; i++) {
          for (int j = 1; j <= 5; j++) {
             System.out.print('@');
          }
          System.out.println();
       }
    }
 }
 