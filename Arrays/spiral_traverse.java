import java.util.*;

class Program {
  public static List<Integer> spiralTraverse(int[][] array) {
    List<Integer> spiral= new ArrayList<>();
    if(array.length==0) return spiral;
    int startRow=0;
    int startCol=0;
    int endRow = array.length-1;
    int endCol = array[0].length-1;
    while(startRow<=endRow && startCol<=endCol){
      traverseLeft(array, startRow, startCol, endCol, spiral);
      if (startRow < endRow) {
          traverseDown(array, endCol, startRow+1, endRow, spiral);
      }
      if (startRow < endRow && startCol < endCol) {
          traverseRight(array, endRow, endCol-1, startCol, spiral);
      }
      if (startRow < endRow && startCol < endCol) {
          traverseUp(array, startCol, endRow-1, startRow+1, spiral);
      }
      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
    return spiral;
  }

  public static void traverseLeft(int[][] array, int startRow, int startCol, int endCol, List<Integer> spiral){
    for(int i=startCol; i<=endCol; i++) spiral.add(array[startRow][i]);
  }
  public static void traverseDown(int[][] array, int endCol, int startRow, int endRow, List<Integer> spiral){
    for(int i=startRow; i<=endRow; i++) spiral.add(array[i][endCol]);
  }
  public static void traverseRight(int[][] array, int endRow, int endCol, int startCol, List<Integer> spiral){
    for(int i=endCol; i>=startCol; i--) spiral.add(array[endRow][i]);
  }
  public static void traverseUp(int[][] array, int startCol, int endRow, int startRow, List<Integer> spiral){
    for(int i=endRow; i>=startRow; i--) spiral.add(array[i][startCol]);
  }
}
