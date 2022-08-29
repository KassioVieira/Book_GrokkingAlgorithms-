import java.util.*;

public class Sum {
  public static void main(String [] args){
    int [] array = {2,4,6};

    System.out.println("Sum = "+ sumArrayWithRecursion(array, array.length));
  }

  public static int sumArrayWithRecursion(int[] array, int length){
    if ( length == 0) {
      return 0;
    } else {
      return sumArrayWithRecursion(array, length-1) + array[length-1];
    }
  }
}
