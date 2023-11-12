import java.util.Scanner;

public class Stack
{
    
    void is_full(int [] arr){
        int counter = arr.length -1;
        int valPosX;
        int numberFull = 0;
        boolean is_full = false;
        do{
            valPosX = arr[counter ];
            System.out.println("pos "+counter+" -->" +valPosX);
            counter --;
            if (valPosX != 0){
                numberFull ++ ;
                if (numberFull == arr.length){
                    is_full = true;
                    System.out.println("\nthe STACK is full!!!");
                }
            }
            
        }while(is_full == false && counter >= 0);
    }
    void is_empty(int [] arr){
        int counter = arr.length -1;
        int valPosX;
        int numberFull = 0;
        boolean is_empty = false;
         do{
            valPosX = arr[counter];
            counter --;
            System.out.println("pos "+counter+" -->" +valPosX);
            if (valPosX == 0){
                numberFull ++ ;
                if (numberFull == arr.length){
                    is_empty = true;
                    System.out.println("\nthe STACK is empty!!!");
                }
            }
            
        }while(is_empty == false && counter >= 0);
    }
    void peek (int [] arrX){
       // int counter = 0;
        int first_val = 0;
       // int [] temp = new int[arrX.length];
        for ( int i = arrX.length ; i > 0 ; i-- ){
           // temp[counter] = arrX[i-1];
           // counter ++;
            if(i == 1){
                first_val = arrX[i-1];
                System.out.print("\nThe first value of the stack is: "+first_val);
            }
        }   
    
    }
    
    
    public Stack(){
      Scanner input = new Scanner(System.in);
      int num = 0 ; int numADD;
      int cond = 0,cond2 = 0;
      int [] stack = new int[8];
      int counter = 0;
      boolean continueOrN = false;
      do {
        System.out.println("\nenter a number to append to stack:");
        try{
            num = Integer.parseInt(input.nextLine());
        }catch(Exception e)
        {
        System.out.println("INVALID INP");
        };
        stack[counter] = num ; 
        if (counter == stack.length-1){
            continueOrN = false;
        }
        else{
            continueOrN = true;
        }
        cond = 0;
        counter ++ ;
        }while(continueOrN == true);
      continueOrN = true;
      counter = stack.length-1;
      do {
        System.out.println("press 1 if you want to pop next");
        System.out.println("press 2 if you want to replace number at pos: "+counter);
        System.out.println("press 3 if you want to execute is_full");
        System.out.println("press 4 if you want to execute is_empty");
        System.out.println("press 5 if you want to perform peek operation\n -->");
        try{
            cond = Integer.parseInt(input.nextLine());
        }catch(Exception e){System.out.println("\nINVALID INPUT >:(");}
      //  System.out.println("do you want to replace val at end of stack: 1 for yes");
        //cond2= Integer.parseInt(input.nextLine());
        if (cond == 1)
          {
            System.out.println("pos:"+counter +", value:"+String.valueOf(stack[counter]));
            counter --;
            stack[counter+1] = 0;   
            }
        else if (cond == 2)
          {
            System.out.println("enter a number to add in place of value at pos #"+(counter ));
            numADD = Integer.parseInt(input.nextLine());
            counter --;
            stack [counter+1] = numADD ;
            System.out.println("you changed it to :"+numADD);
            }
        else if (cond == 3){
            is_full(stack);
        }
        else if (cond == 4){
            is_empty(stack);
        }
        else if (cond == 5){
            peek(stack);
        }
        cond = 0;
        System.out.println("\nDO YOU WANT TO CONTINUE? \n(press 1 if yes)");
        try{
        cond2 = Integer.parseInt(input.nextLine());}
        catch(Exception e){System.out.println("bye bye ... but Invalid input");}
        if ( cond2 != 1){
            continueOrN = false;
        }
        else if (cond2 ==1 && counter == 0) {
            counter = stack.length-1;
        }
        
        }while(continueOrN == true);
    }
}
