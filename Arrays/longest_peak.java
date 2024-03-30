import java.util.*;

class Program {
  public static int longestPeak(int[] array) {
    int n = array.length;
    int[] left = new int[n];
    for(int i=1; i<n; i++){
      if(array[i]>array[i-1]){
        left[i] = left[i-1]+1;
      }
    }
    int[] right = new int[n];
    for(int i=n-2; i>=0; i--){
      if(array[i]>array[i+1]){
        right[i] = right[i+1]+1;
      }
    }
    int maxPeak = 0;
    for(int i=1; i<n-1; i++){
      if(left[i]!=0 && right[i]!=0){
        maxPeak = Math.max(left[i]+right[i]+1, maxPeak);
      }
    }
    return maxPeak;
  }
}
