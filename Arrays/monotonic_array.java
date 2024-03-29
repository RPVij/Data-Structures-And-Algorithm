import java.util.*;

class Program {
  public static boolean isMonotonic(int[] array) {
    return monotonicInc(array) || monotonicDec(array);
  }

  public static boolean monotonicInc(int[] array){
    for(int i=0; i<array.length-1; i++){
      if(array[i]>array[i+1]) return false;
    } return true;
  }
  public static boolean monotonicDec(int[] array){
    for(int i=0; i<array.length-1; i++){
      if(array[i]<array[i+1]) return false;
    } return true;
  }
}
