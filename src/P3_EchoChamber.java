import java.util.Scanner;

/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

public class P3_EchoChamber {

 public static void main(String[] args) {
   
    Scanner console = new Scanner(System.in);                                //scanner class for user input
    System.out.print("Please enter your phrase? "); 
    String phrase = console.nextLine();
    System.out.print("How many times would you like to repeat it? "); 
    int number = console.nextInt();
    for (int i=0;i<number;i++)                                               //loop to repeat the phrase
    System.out.println(phrase); 

 }

}