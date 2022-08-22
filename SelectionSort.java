import java.util.*;

public class SelectionSort {
  public static void main(String[] args) {    
      int[] array =  {5,3,6,2,10,9,15,20,0,12};

      System.out.println(Arrays.toString(getSelectionSortArray(array)));
  }

  public static int[] getSelectionSortArray(int[] array){
    int[] newArray = new int[array.length];
    
    for(int i = 0; i < newArray.length; i++){
      int smaller = getIndexSmallerValue(array);
      newArray[i] = array[smaller];
      array = removeTheElement(array, smaller);
    }

    return newArray;
  }

  // found small value in a array and return index
  public static int getIndexSmallerValue(int[] array){
    int smaller = array[0];
    int smallerIndex = 0;

    for(int i = 1; i < array.length; i++){
      if(array[i] < smaller){
        smaller = array[i];
        smallerIndex = i;
      }
    }
    return smallerIndex;
  }

  // this function can found in https://www.geeksforgeeks.org/remove-an-element-at-specific-index-from-an-array-in-java/
  public static int[] removeTheElement(int[] arr, int index)
    {
        int[] anotherArray = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }
 
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }
}
