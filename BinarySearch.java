import java.util.*;

public class BinarySearch{

  public static void main(String[] args) {
    int[] list = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; 
    int choisedNumber = 16;

    binarySearch(list, choisedNumber);
  }

  public static void binarySearch(int[] list, int value){
    int start = 0;
    int end = list.length-1;
    int middle = 0;

    while(start <= end){
      middle = (start+end)/ 2;
      
      if(list[middle] == value){
        System.out.println("number found "+list[middle]);
        break;
      }
      
      if(list[middle] < value){
        start  = middle + 1;
      } else{
        end = middle - 1;
      }
    }
  }
}
