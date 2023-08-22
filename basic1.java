//Find the largest number of the 3 numbers
package Knowledgeofjava;
import java.util.Scanner;
public class Javaprac1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double Max = a;

        if(b > a){
            Max = b;
        }
        if(c > b){
            Max = c;
        }
        System.out.println("The Maximum Value is: "+Max);
    }
}