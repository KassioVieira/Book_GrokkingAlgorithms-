public class Items {
  public static void main(String [] args){
    int [] array = {0,1,2,3,4,5,6,7,8,9,10};
    int count = 0;
    System.out.println(numberElements(array,count));
  }

  // count number of elements in array using recursion.
  public static int numberElements(int [] array, int count){
    if(array.length == 0){
      return count;
    } else {
      return numberElements(removeItem(array), count+1);
    }
  }

  // function used for remove a item the of array.
  public static int [] removeItem(int [] array){
    if(array.length == 0) {
      return array;
    }

    int [] newArray = new int[array.length-1];
    for(int i = 1 ; i <array.length; i++){
      newArray[i-1] = array[i];
    }

    return newArray;
  }
}
