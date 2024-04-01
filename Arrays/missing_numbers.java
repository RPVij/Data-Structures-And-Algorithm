import java.util.*;

class Program {
  public int[] missingNumbers(int[] nums) {
    int n=nums.length+2;
    int l=nums.length;
    int sum = n*(n+1)/2;;
    for(int i=0; i<l; i++){
      sum -= nums[i];
    }
    int m = sum/2;
    int a = (m)*(m+1)/2;
    int b = (n)*(n+1)/2 - a;
    for(int i=0; i<l; i++){
      if(nums[i]<=m) a-=nums[i];
      else b-=nums[i];
    }
    return new int[] {a, b};
  }
}
