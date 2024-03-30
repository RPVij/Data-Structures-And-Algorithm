import java.util.*;

class Program {
  public int firstDuplicateValue(int[] array) {
    int n=array.length;
    for(int i=0; i<n; i++){
      if(array[Math.abs(array[i])-1]<0) return Math.abs(array[i]);
      else array[Math.abs(array[i])-1] *= -1;
    }
    return -1;
  }
}
