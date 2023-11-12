
/**
 * Write a description of class String_hashing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class String_hashing
{
    int HashCode(String val, int valRange){
    int charval = 0;
    int val2 = 0;
    for (int index = 0; index<val.length();index++){
    charval = (int)val.charAt(index);
    val2 += charval%10;
    }
    return val2; 
    }
    // instance variables - replace the example below with your own
    public String_hashing(){
        Scanner input = new Scanner(System.in);
        int valRange = 10;
        int val ;
        String String1   =input.nextLine();
        val =  HashCode(String1,valRange);
        System.out.println("you new hash key -->"+String.valueOf(val));
    
    }
}
