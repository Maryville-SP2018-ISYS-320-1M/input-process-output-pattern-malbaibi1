import java.util.Scanner;

/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

public class StringWeaver {

 public static void main(String[] args) {
   
    Scanner console = new Scanner(System.in);                                //scanner class for user input
    System.out.print("Enter the first string: "); 
    String string1 = console.nextLine();
    System.out.print("Enter the second string: "); 
    String string2 = console.nextLine();
    String woven = mix(string1,string2);                                     //method calling fo mixing two strings
    System.out.println("When woven '" + woven + "' is your new word."); 

 }
    public static String mix(String string1, String string2) {
    final int string1Length = string1.length();
    final int string2Length = string2.length();
    final int min = Math.min(string1Length, string2Length);                  //math function to find minimum length
    final StringBuilder sb = new StringBuilder(string1Length + string2Length);
    for(int i = 0; i < min; i++) {
        sb.append(string1.charAt(i));
        sb.append(string2.charAt(i));
    }
    return sb.toString();
}

}