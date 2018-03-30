import java.util.Scanner;

/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

/*
 Your expected results after the input is provided:
 
 1. 34.5  As the data type is double.                                                  //correct
 2. 6.0   Due to data type is double.                                                  //correct
 3. Error Because data type of money is double, special character is not allowed.      //correct
 4. Error Because data type of money is double, string is not allowed.                 //correct
 
 5. Error Because data type of money is double, special character is not allowed.      //correct
 6. Error Because data type of money is double, alphabet is not allowed.               //correct
 7. Error Because data type of money is double, string is not allowed.                 //correct
 8. 645.0 Due to data type is double.                                                  //correct
  
 */

public class P1_TestInputExpressions {

 public static void main(String[] args) {
  Scanner console = new Scanner(System.in); 
  System.out.print("How much money do you have? "); 
  double money = console.nextDouble();
  System.out.println("money = " + money); 

 }

}