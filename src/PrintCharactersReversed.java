/*Programmer: Austin Parker   Date: Sept. 24, 2020
 * Assignment: 18.8 PrintCharactersReversed
 * Description: Program accepts user input of set of numbers,
 * outputs the user numbers in reverse order*/


import java.util.Scanner;

public class PrintCharactersReversed {
    public static void main(String[] args) {
        try {
            /*ask for user input*/
            System.out.println("Enter number: ");
            /*creates scanner*/
            Scanner scanner = new Scanner(System.in);
            /*assign scanner input to userInput var*/
            String userInput = scanner.nextLine();
            /*parse string to int userNumber*/
            int userNumber = Integer.parseInt(userInput);
            /*output to user with reversed number*/
            System.out.println("Your number reversed is: ");
            /*calls the reverseDisplay method*/
            reverseDisplay(userNumber);
        } catch (Exception ex) {
            /*error message*/
            System.out.println("There was a problem and the program must close.");
            System.exit(0);
        }/*end of try,catch*/

    }/*end of main*/

    public static void reverseDisplay(int value) {
        if (value > 0) {
            /*prints output in single line*/
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
    }/*end of reverseDisplay*/
}/*end of class*/
