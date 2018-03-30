import java.util.Scanner;


/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

public class P2_Doubler {

 public static void main(String[] args) {
  
   Scanner console = new Scanner(System.in);                                  //scanner class for user input
   System.out.print("What is your number? Please input integers only. "); 
   int number = console.nextInt();
   number = number * 2;                                                       //equation to double the input number
   System.out.println("That number doubled is = " + number); 

 }

}