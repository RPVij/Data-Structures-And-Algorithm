import java.util.*;

class Program {
  public boolean zeroSumSubarray(int[] nums) {
    Set<Integer> hashSet = new HashSet<>();
    int sum=0;
    hashSet.add(sum);
    for(int i=0; i<nums.length; i++){
      sum += nums[i];
      if(hashSet.contains(sum)) return true;
      else hashSet.add(sum);
    }
    return false;
  }
}
