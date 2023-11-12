
/**
 * Write a description of class stack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.LinkedList;
import java.util.Scanner;


public class stack
{
    LinkedList<String> PushSTACK(LinkedList<String> StackX,Scanner inp){
        String appendVal = inp.nextLine();
        StackX.offerLast(appendVal);
        return StackX;
        
    }
    LinkedList<String> PopSTACK(LinkedList<String> StackX){
        StackX.removeLast();
        return StackX;
    }
    void CollectSTACK(LinkedList<String> StackX ){
            System.out.println(StackX.peekLast());;
    }
    void main(LinkedList<String> St,Scanner inp){
        int UserInp = 0;
        while (true){
            System.out.println("Functions of Stack are:");
            System.out.println("Enter 1 to perform pop operation");            
            System.out.println("Enter 2 to perform push operation\n");
            System.out.println("Enter 3 to perform collection operation");
            UserInp = Integer.parseInt(inp.nextLine());
            if (UserInp == 1){
                PopSTACK(St);
            }
            if (UserInp == 2){
                PushSTACK(St,inp);
            }
            if (UserInp == 3){
                CollectSTACK(St);
            }
        }
    }
    public stack(){
        LinkedList<String> Stack = new LinkedList();
        Scanner input = new Scanner(System.in);
        main(Stack,input);
    }
}
