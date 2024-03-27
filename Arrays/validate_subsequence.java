import java.util.*;

class Program {
  public static boolean isValidSubsequence(
    List<Integer> array, List<Integer> sequence
  ) {
    int i=0;
    int j=0;
    while(i<array.size() && j<sequence.size()){
      if(array.get(i) == sequence.get(j))j++;
      i++;
    }
    return j==sequence.size()?true:false;
  }
}
