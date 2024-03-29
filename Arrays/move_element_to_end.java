import java.util.*;

class Program {
  public static List<Integer> moveElementToEnd(
    List<Integer> array, int toMove
  ) {
    int i=0;
    int j=array.size() - 1;
    while(i<j){
      if(array.get(j)==toMove){
        j--;
        continue;
      }else if(array.get(i)==toMove){
        array.set(i,array.get(j));
        array.set(j,toMove);
        j--;
      } i++;
    }
    return array;
  }
}
