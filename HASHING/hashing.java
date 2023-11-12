
/**
 * Write a description of class hashing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class hashing
{
    int HashCode(int val, int valRange){
    val = val%10;
    return val; 
    }
    // instance variables - replace the example below with your own
    public hashing(){
        Scanner input = new Scanner(System.in);
        int valRange = 10;
        int number   = Integer.parseInt(input.nextLine());
        
        number =  HashCode(number,valRange);
        System.out.println("you new hash key:"+String.valueOf(number));
    
    }
}
