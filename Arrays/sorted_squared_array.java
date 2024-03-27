import java.util.*;

class Program {
  public int[] sortedSquaredArray(int[] array) {
    int[] output = new int[array.length];
    for(int i=0; i<array.length; i++){
      output[i] = array[i]*array[i];
    }
    Arrays.sort(output);
    return output;
  }
}
