import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public int evaluateExpressionTree(BinaryTree tree) {
    if(tree==null) return 0;
    if(tree.left == null && tree.right == null) return tree.value;
    int left =  evaluateExpressionTree(tree.left);
    int right = evaluateExpressionTree(tree.right);
    return switch(tree.value){
      case -1 -> left+right;
      case -2 -> left-right;
      case -3 -> left/right;
      case -4 -> left*right;
      default -> 0;
    };
  }
}
