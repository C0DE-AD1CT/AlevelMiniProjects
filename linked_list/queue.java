
/**
 * Write a description of class queue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.LinkedList;
import java.util.Scanner;
public class queue
{
    LinkedList<String> enqueue(LinkedList<String>QueueX,Scanner input){
        String X = ""; 
        System.out.println("\nEnter a String to enqueue:");
        X = input.nextLine();
        QueueX.addLast(X);
    return QueueX;
    }
    LinkedList<String> dequeue(LinkedList<String> QueueX){
        System.out.println(QueueX.removeFirst());
    return QueueX;
    }
    void iterateThroughQ(LinkedList<String> QueueX, int size){
        String temp = "[";
        for (int index = 0; index<size;){
            if (index != size-1){
                System.out.println(index);
                temp+=String.valueOf(QueueX.get(index))+",";                
            }
            else{
                temp+=String.valueOf(QueueX.get(index));
            }
            index = index + 1;
        }
        temp +="]";
        System.out.println(temp);
        
    }
    void FrontQ(LinkedList<String> QueueX){
        System.out.println("the first value in the Queue is -->"+QueueX.getFirst())  ; 
    }
    void RearQ(LinkedList<String> QueueX){
        System.out.println("the end value in the Queue is   -->"+QueueX.getLast());
    }
  public queue(){
    Scanner input = new Scanner(System.in);
    LinkedList<String> queue = new LinkedList();
    int end = 0;  int size = 0;
    int userInp = 0 ;
    boolean loop = true;
    while (loop = true){
        // the following displays all the functions of the Queue 
        System.out.println("\nFollowing Queue Functions:");
        System.out.println("press 1 for enqueue ");
        System.out.println("press 2 for dequeue ");
        System.out.println("press 3 for Queue size");
        System.out.println("press 4 for Front ");
        System.out.println("press 5 for Rear");
        //the following handles the input from the user and converts
        //from string to integer
        userInp = Integer.parseInt(input.nextLine());
        size = queue.size();
        //the logic of the code
        //these if statements assign the users input to their allocated function
        if (userInp == 1){
            queue = enqueue(queue,input);
        }
        if (userInp == 2&& size!= 0){
            queue = dequeue(queue);
        }
        else if(userInp == 2 && size == 0 ){
            System.out.println("Operation invalid!!!\nQueue empty!!!");
        }
        if (userInp == 3 && size!= 0){
            System.out.println("The size of the Queue is --> "+ size);
            iterateThroughQ(queue,size);
        }
        else if(userInp == 3 && size == 0 ){
            System.out.println("The size of the Queue is --> "+ size);
        }
        if (userInp == 4&& size!= 0){
            FrontQ(queue);
        }
        else if(userInp == 4 && size == 0 ){
            System.out.println("Operation invalid!!!\nQueue empty!!!");
        }
        if (userInp == 5 && size!= 0){
            RearQ(queue);
        }
        else if(userInp == 5 && size == 0 ){
            System.out.println("Operation invalid!!!\nQueue empty!!!");
        }
    }
    }
}
