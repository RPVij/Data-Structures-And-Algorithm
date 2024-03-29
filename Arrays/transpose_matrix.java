
import java.util.*;

class Program {
  public int[][] transposeMatrix(int[][] matrix) {
    if(matrix.length==0) return new int[0][0];
    
    int[][] transpose = new int[matrix[0].length][matrix.length];
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        transpose[j][i] = matrix[i][j];
      }
    }
    return transpose;
  }
}
