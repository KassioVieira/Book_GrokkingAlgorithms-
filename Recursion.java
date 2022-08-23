import java.util.*;

// I used recursion in this case to solve the factorial, you can use recursion to resolve other issues.

public class Recursion{

  public static void main(String[] args) {
    System.out.println(factorial(3));
  }

  public static int factorial(int number){
      if(number == 1){ 
        return 1;
      } else {
        return number * factorial(number -1);
      }
  }
}
