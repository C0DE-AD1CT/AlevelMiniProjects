
/**
 * Write a description of class FUNCS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FUNCS
{
 
    int factorial (int num){
        if(num == 1){
            return 1;
        }
        if (num == 0){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }}
    int sum(int num){
        if (num == 0)
            return 0;
        else {
            return num + sum(num-1);
        }
    
    }
    


}
