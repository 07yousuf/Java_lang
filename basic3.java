//find the uppercase and lowercase letter
package Knowledgeofjava;
import java.util.Scanner;
public class JavaPrac3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}