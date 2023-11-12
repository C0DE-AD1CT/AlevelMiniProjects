
/**
 * Write a description of class binary_search here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class binary_search extends funcs
{
   
   
   // void binarySearch(int arr[]){}
    
   public binary_search () {
    int [] arr_1 = {1,33,5,9,8,7,11,3,4};
    int arr_len = arr_1.length;
    int [] arr = new int[arr_1.length] ;
    String arrStr = "[";
    String arrStr2= "[";
    for (int i=0 ; i<arr_len; i++ ){
        //arrStr+=arr[i]+",";
        arrStr2+=arr_1[i]+",";
    }
    int [] c = BubbleSort(arr_1);
    arr = c;
    for (int i=0 ; i<arr_len; i++ ){
        arrStr+=arr[i]+",";
       // arrStr2+=arr_1[i]+",";
    }
    arrStr+="]";
    arrStr2+="]";
    System.out.println("UNSORTED :"+arrStr2);
    System.out.println("SORTED   :"+arrStr);

    BinarySearch(arr, 11);
    BinarySearch(arr, 33);
   // BinarySearch(arr, 5);
}
    
}
