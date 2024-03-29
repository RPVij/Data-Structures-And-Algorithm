import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    ArrayList<Integer[]> triplets = new ArrayList<Integer[]>();
    Arrays.sort(array);
    for(int i=0; i<array.length; i++){
      for(int j=i+1,k=array.length-1; j<k;){
        int sum = array[i]+array[j]+array[k];
        if(sum == targetSum){
          triplets.add(new Integer[] {array[i], array[j], array[k]});
          j++;
          k--;
        } else if (sum > targetSum) k--;
        else j++;
      }
    }
    return triplets;
  }
}
