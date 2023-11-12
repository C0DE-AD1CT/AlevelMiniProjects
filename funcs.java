
/**
 * Write a description of class funcs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class funcs
{
    // instance variables - replace the example below with your own
     int [] BubbleSort(int arr[] ){
        int len = arr.length; // get the length
        for (int i = 0;i<len -1 ; i++){ // loop through the length 
            for (int j =0;j<len-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];// stores it temporarily 
                    arr[j] = arr[j+1];// changes the value at j to j+1
                    arr[j+1] = temp; // changes the value at j to j+1
                }
            }
        }
        return arr;
    }
    void BinarySearch (int arr[],int Search){
            System.out.println("SEARCHING FOR:"+String.valueOf(Search));
            int n = arr.length;
            String arrStr;
            double mid = Math.floor(n/2); 
           // System.out.println((int)mid);
            boolean found = false;
            boolean not_found = false;
            while (found == false && not_found == false){
                try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
                if (arr[(int)mid]>Search){ // type casting performed as double need s to be converted to int
                    //range will be from 0 to [mid -1]
                     
                    // System.out.println((int)mid);
                     arrStr = "[";
                     for (int var = 0;var<(int)mid;var++){
                        arrStr+=arr[var]+",";
                        }
                     arrStr +="]";
                     System.out.println(arrStr);
                     mid = Math.floor(mid/2.0) ;
                     System.out.println(mid);
                }
                if (arr[(int)mid]<Search){
                    //range will be from [mid -1] to  [n -1]
                   
               //     System.out.println(mid);
                    arrStr = "[";
                     for (int var = (int) mid ;var<n;var++){
                        arrStr+=arr[var]+",";
                        }
                     arrStr +="]";
                     System.out.println(arrStr);
                     if ((int)Math.floor(n)< Search){
                         mid = Math.floor((n+ mid)/2.0) ;
                         System.out.println("A");
                        }
                    else {
                        mid = Math.floor((mid+1)/2.0);
                    }
                   // System.out.println(mid);
                }
                
                if (arr[(int)mid]==Search){
                    found = true;
                    System.out.println(String.valueOf(Search)+" --> FOUND AT POS:"+String.valueOf((int)mid));
                }
                if (mid == 0 && arr[(int)mid] != Search){
                
                    not_found = true;
                }
                if (mid == (arr.length -1) && not_found != true){
                    not_found = true;
                    System.out.println(String.valueOf(Search)+" --> NOT FOUND");
                }
                
            
            }      
    
    }
    }

