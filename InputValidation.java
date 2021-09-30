// Jeff Blankenship
// CS-151
// Input Validation using a while loop

import java.util.Scanner;

public class InputValidation {
  
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    boolean askAgain = true;
    String answer = "";
    
    //keep asking for a yes/no answer until received
    while (askAgain) {
      System.out.println("\nPlease enter yes or no: ");
      answer = scan.nextLine();
      if ( answer.equals("yes") || answer.equals("no") ) {
        askAgain = false;
      } else {
        System.out.println("That was not a valid entry.");
      }
    }
      
    //display the results
    System.out.println("The final entry was: " + answer);
    
  } // end main
} // end InputValidation