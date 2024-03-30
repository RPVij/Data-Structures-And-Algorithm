import java.util.*;

class Program {
  public int[][] mergeOverlappingIntervals(int[][] intervals) {
    if(intervals.length<=1) return intervals;
    Arrays.sort(intervals, new Comparator<int[]>(){
      @Override
      public int compare(int[] interval1, int[] interval2){
        return Integer.compare(interval1[0], interval2[0]);
      }
    });

    int[] previousInterval = intervals[0];
    List<int[]> mergedIntervals = new ArrayList<>();
    for(int i=1;i<intervals.length; i++){
      int[] currentInterval = intervals[i];
      if(previousInterval[1]>=currentInterval[0]){
        previousInterval[1] = Math.max(currentInterval[1], previousInterval[1]);
      } else{
        mergedIntervals.add(previousInterval);
        previousInterval = currentInterval;
      }
    }
    mergedIntervals.add(previousInterval);
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
  }
}
