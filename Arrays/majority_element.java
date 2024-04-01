import java.util.*;

class Program {
  public int majorityElement(int[] array) {
    if(array.length==0) return -1;
    int e = array[0];
    int c = 1;
    for(int i=1; i<array.length; i++){
      if(c==0){
        e=array[i];
        c++;
      } else if(e==array[i]){
        c++;
      } else c--;
    }
    return e;
  }
}
