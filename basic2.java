//find the largest number of the 3 numbers
package Knowledgeofjava;
import java.util.Scanner;
public class JavaPrac2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Math.max(c,Math.max(a,b));
        System.out.println("The Max value is: "+max);
    }
}