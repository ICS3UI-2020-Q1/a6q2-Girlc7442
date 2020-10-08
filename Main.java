import java.util.Scanner;

/**
 * A search algorithm to find a number the user inputs
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user to enter 10 integers
    System.out.println("Please enter in 10 integers to put into the array");

    //store the 10 integers in an array
    int[] numbers = new int[10];

    //takes the users integers to put them in an array
    for(int i = 0; i < 10; i++){
      numbers[i] = input.nextInt();
    }
    
    //asks the user to enter a number to search for
    System.out.println("Please enter a number to find");
    int userSearch = input.nextInt();

    //searches for the number that the user input and tells the user what index it is on
    for(int i = 0; i < 10; i++){
      if(numbers[i] == userSearch){
        System.out.println(userSearch + " is located at index " + i);
      }
    }

  }
}
