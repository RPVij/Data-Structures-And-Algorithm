import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] array) {
    int n = array.length;
    int[] product = new int[n];
    product[0] = 1;
    for(int i=1; i<n; i++){
      product[i] = product[i-1]*array[i-1];
    }
    int rightProduct = 1;
    for(int i=n-2; i>=0; i--){
      rightProduct *= array[i+1];
      product[i] = product[i]*rightProduct;
    }
    return product;
  }
}
