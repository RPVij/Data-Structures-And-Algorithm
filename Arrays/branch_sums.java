import java.util.*;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    if(root == null) return new ArrayList<Integer>();
    if(root.left == null  && root.right == null) return new ArrayList<Integer>(Arrays.asList(root.value));
    List<Integer> left = branchSums(root.left);
    List<Integer> right = branchSums(root.right);
    left.addAll(right);
    for(int i=0; i<left.size();i++){
      left.set(i,left.get(i) + root.value);
    }
    return left;
  }
}
