import java.util.*;

class Program {
  public int bestSeat(int[] seats) {
    int n = seats.length;
    int bSeat = -1;
    int curSeat = 0;
    int maxSpace = 0;
    int space = 0;
    for(int i=0; i<seats.length; i++){
      if(seats[i]==0){
        if(curSeat!=0){
          space++;
        }else{
          curSeat = i;
          space++;
        }
      }else{
        if(space>maxSpace){
          bSeat = (2*curSeat+space-1)/2;
          maxSpace = space;
          curSeat = 0;
          space = 0;
        }else{
          curSeat = 0;
          space = 0;
        }
      }
    }
    return bSeat;
  }
}
