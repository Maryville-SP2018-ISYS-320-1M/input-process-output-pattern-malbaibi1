import java.util.Scanner;

/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

public class P4_ScalableBox {

 public static void main(String[] args) {
   
  Scanner console = new Scanner(System.in);                                  //scanner class for user input
  System.out.print("Enter the width of box? "); 
  int width = console.nextInt();                                             //user input for width
  System.out.print("Enter the height of box? "); 
  int height = console.nextInt();                                            //user input for height
  drawBoxCap(width);
  drawBoxInsides(width, height);
  drawBoxCap(width);
 }
 
 public static void drawBoxCap(int width) {                                   //parameterize the drawBoxCap
  System.out.print("+");
  
  for( int capDashIndex = 1; capDashIndex <= width - 2; capDashIndex++ ) {
   System.out.print("-");
  }
  
  System.out.println("+");
 }
 
 public static void drawBoxInsides(int width, int height) {                     //parameterize the drwBoxInsides 
  for( int insideRowIndex = 1; insideRowIndex <= height - 2; insideRowIndex++ ) {
   drawBoxInsideLine(width);
  }
 }
 
 public static void drawBoxInsideLine(int width) {                              //parameterize the drwBoxInsidesLine
  System.out.print("|");
  
  for( int insideRowIndex = 1; insideRowIndex <= width - 2; insideRowIndex++ ) {
   System.out.print(".");
  }
  
  System.out.println("|");
 }

}