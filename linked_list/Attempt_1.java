
/**
 * Write a description of class Attempt_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.LinkedList;

public class Attempt_1
{
  
    LinkedList<String> appendList(LinkedList<String> listX,String [] ArrX){
    System.out.println("appending contents to linked list ...");
    for (int index = 0; index<ArrX.length;index ++){
        listX.addLast(ArrX[index]);
        System.out.println(ArrX[index]);
    }
    System.out.println("-->Done!");
    return listX;
    }
    void outputList(LinkedList<String> listX){
        String StringX = "[";
        int listXlen = listX.size()-1;
        while (listXlen >= 0){
            StringX += listX.removeFirst()+",";
           // System.out.print(listXlen);
            listXlen -- ;
        }
        StringX += "]";
        System.out.println(StringX);
    }
  public Attempt_1(){
    // constants
    String [] const1 = {"2","5","15","36","47","56","59","78","156","244","268"};
    String [] const2 = {"18","39","42","43","66","69","100"};
    //variable body
    LinkedList<String> list1= new LinkedList<String>();
    LinkedList<String> list2= new LinkedList<String>();
    LinkedList<String> MergeList = new LinkedList<String>();
    list1 = appendList(list1,const1);list2 = appendList(list2,const2);
    int list1len = list1.size() -1;int list2len = list2.size() -1;
    String itemX = "";
    String temp = "";
    // main body
    while(list1len >= 0){
        //System.out.println(list1len);
        itemX = list1.removeFirst();
        temp = itemX;
        MergeList.addLast(itemX);
        list1.addLast(temp);
        itemX = "";
        list1len = list1len - 1;
        }
    while(list2len >= 0){
        itemX = list2.removeFirst();
        MergeList.addLast(itemX);
        list2.addLast(itemX);
        itemX = "";
        list2len = list2len - 1;
        }
    outputList(list1); 
    outputList(list2);
    outputList(MergeList);    
    
    }
}
