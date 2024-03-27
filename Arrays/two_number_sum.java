import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
    for(int i=0,j=array.length-1; i<j;){
      if(array[i]+array[j] == targetSum) return new int[]{array[i], array[j]};
      else if(array[i]+array[j] > targetSum) j--;
      else i++;
    }
    return new int[0];
  }
}
