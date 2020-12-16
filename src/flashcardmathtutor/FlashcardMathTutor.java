/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcardmathtutor;
import java.util.Scanner;

/*Flashcard Math Tutor Program
 *By: Jacob Mason
 *Verison 1.1.1*/
public class FlashcardMathTutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Welcoming the User and explaining the purpose
        System.out.println("Welcome to the Java Math Tutor");
        System.out.println("This program will produce two numbers and ask you to solve an addition problem");
        
        //Creating integers for the addition problem and giving them values
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        
        //Prompting the User for a solution to the problem
        System.out.print("What is " + a + " + " + b + " ");
        Scanner input = new Scanner(System.in); //Creating a scanner object
        int answer = input.nextInt();
        
        //Solving the addition problem
        int c = a + b; //Creating a new integer to hold the value of the solution
        System.out.println("The answer is " + c);
        
        //Saying Goodbye to the User
        System.out.println("Goodbye and thank you for using the Java Math Tutor");
        
    }
    
}
