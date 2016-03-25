import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class Fortunes here.
 * 
 * Michael Reinhart  
 * 1/5/2016
 */
public class Fortunes
{
    private String[] Fortunes;
    private int count;

    public Fortunes(String fileName) throws IOException {
        Fortunes = new String[10];
        Scanner reader = new Scanner(new File(fileName));
        for(int i = 0; i < Fortunes.length && reader.hasNext(); i++){
            Fortunes[i] = reader.nextLine();
        }  
    }    

    public String getFortune(){
        int response = (int) (Math.random()*10);
        return Fortunes[response];

    }

    public void printAll(){

        for (int i = 0; i < Fortunes.length; i++){
            System.out.println(Fortunes[i]);
        }

    }

    public void printAllFE(){
        for(String fortune: Fortunes){
            System.out.println(fortune);       
        }
    }
}