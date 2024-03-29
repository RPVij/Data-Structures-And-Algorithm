import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    int smallestDif = Integer.MAX_VALUE;
    int a = 0;
    int b = 0;
    int i=0;
    int j=0;
    while(i<arrayOne.length && j<arrayTwo.length){
      int dif = Math.abs(arrayOne[i]-arrayTwo[j]);
      if(dif<smallestDif){
        a = arrayOne[i];
        b = arrayTwo[j];
        smallestDif = dif;
      }
      if(arrayOne[i]<arrayTwo[j])i++;
      else j++;
    }
    return new int[]{a,b};
  }
}
