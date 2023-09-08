package Knowledgeofjava;
import java.util.*;
public class loop_syntax {
    public static void main(String args[]){
        /* Syntax of for loop
        for (Initialisation; condition; increment/decrement) {
            body
            }
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Max_number: ");
        int Max_number =input.nextInt();

        for(int i=0; i<=Max_number; i++){ //you use for loop when you know how many times the loop is going to run
            System.out.println(i);
        }
        /*Syntax of While Loop
        Initialisation;
        while(condition){
            body;
            increment/decrement;
            }
         */
        int i=0; //you use while loop when you don't know how many times the loop is going to run
        while(i<=Max_number){
            System.out.print(i+" ");
            i++;
        }
        /*Syntax of Do While loop
        Initialisation;
        do{
            body;
            increment/decrement;
            } while(condition);
         */
        int j=0;
        do {
            System.out.println("Iya rafeu");
            j++;
        } while(j == Max_number);
    }
}