import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class FortuneDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FortuneDriver
{
    public static void main (String args[])throws IOException {
        Scanner scanner = new Scanner(System.in);
        Fortunes myFortune = new Fortunes("README.txt"); 
        System.out.println("Random: " + myFortune.getFortune());
        int a = 1;
        while (a == 1){ 
            System.out.println("Type \"Y\" for another fortune,\"N\" to end the program");
            String response = scanner.next();
            if(response.equals("Y")){
                System.out.println(myFortune.getFortune());
                System.out.println();
            }
            else if (response.equals("N")){
                myFortune.printAllFE();
                a=2;
            }
            else
                System.out.println("Invalid letter");


        }
    }
}
