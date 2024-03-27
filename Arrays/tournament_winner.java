import java.util.*;

class Program {
  public String tournamentWinner(
    ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
  ) {
    Map<String,Integer> map = new HashMap<>();
    for(int i=0; i<competitions.size(); i++){
      if(results.get(i)==0){
        String winningTeam = competitions.get(i).get(1);
        if(map.containsKey(winningTeam)) map.put(winningTeam,map.get(winningTeam)+3);
        else map.put(winningTeam,3);
      } else{
        String winningTeam = competitions.get(i).get(0);
        if(map.containsKey(winningTeam)) map.put(winningTeam,map.get(winningTeam)+3);
        else map.put(winningTeam,3);
      }
    }
    String winningTeam = "";
    int winningPoints = 0;
    for(Map.Entry<String,Integer> entry : map.entrySet()){
      if(winningPoints < entry.getValue()){
        winningTeam = entry.getKey();
        winningPoints = entry.getValue();
      }
    }
    return winningTeam;
  }
}
