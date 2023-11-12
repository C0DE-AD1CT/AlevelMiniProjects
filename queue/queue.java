
/**
 * QUEUE PROGRAM: 
 *Functions:ENQUEUE,DEQEUE,QUEUESIZE,ITEMNUM
 * @author (Alexander)
 * @version (15/10/2021)
 */
import java.util.Scanner;

public class queue
{
    int [] enQueue(int [] arr,Scanner input,int Front){
        int numX = 0;
        System.out.println("\nenter a number in position ["+Front+"]\n-->");
        try {
            arr[Front] = Integer.parseInt(input.nextLine());
        }catch(Exception e){System.out.println("INCORRECT INPUT");}
        return arr;
    }
    int [] deQueue(int [] arr,Scanner input,int End){
        int numX = arr[End];
        if (numX!=0)
        {
            System.out.println("dequeue-ing -->"+numX+" at position ["+End+"]");
        }
        else{
            System.out.println("\nCANNOT DEQUEUE EMPTY PLACEHOLDER\n");
        }
        return arr;
    }
    void outputItemNum(int var){
        System.out.println("Number of items in the queue --> "+var+"\n");
    }
    int queueSize(int[] arr){
        return arr.length;
    }
    public queue() {
        int queue_size = 5;
        int [] queue = new int[queue_size];
        int Front = 0 ; int End = 0 ;
        int cond = 0;
        int numAdded = 0;
        boolean loop = true;
        Scanner input = new Scanner (System.in);
        while(loop == true){
            System.out.println("\n================================================");
            System.out.println("press 1 to perform enqueue operation:");
            System.out.println("press 2 to perform dequeue operation:");
            System.out.println("press 3 to perform SizeOfQueue operation:");
            System.out.println("press 4 to perform NumOfItems operation:\n-->");
            cond = Integer.parseInt(input.nextLine());
            System.out.println("================================================\n");
            if (cond == 1){
                if (queue[Front] == 0)
                {
                    queue = enQueue(queue,input,Front);
                    numAdded ++;
                }
                else{
                    System.out.println("\nCANNOT OVERWRITE POS THAT HASN'T BEEN DEQUEUED!!!\n");
                }
                if (Front < (queue.length-1)){
                    Front ++;
                    
                }
                else{
                    Front = 0;
                }
            }
            if (cond == 2){
                if (queue[End]!=0)
                {
                    queue = deQueue(queue,input,End);
                    numAdded --;
                    if (End < (queue.length-1)){
                        End ++;
                    }
                    else{
                        End = 0;
                    }
                }
                else{System.out.println("\nCANNOT OVERWRITE POS THAT HASN'T BEEN DEQUEUED!!!\n");}
            }
            if (cond == 4)
            {
                outputItemNum(numAdded);
            }
            if (cond == 3)
            {
                System.out.println("The size of the queue is \n---> "+queueSize(queue)+"\n");
            }
        //for debugging 
        /*
        for (int i = 0; i<queue.length-1;i++){
            System.out.println(queue[i]);
        }*/
        }  
    }
}
