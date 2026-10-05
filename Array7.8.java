a) Display the value of the tenth element of arrray r.

public class Array1{
    public static void main (String[] args){
    
    int[] r = {3,6,9,4,7,2,9,10,49,50};
    System.out.println("The tenth element is: " + r[9]);

}    
} 


b) initialize each of the six elements of one dimensional integer array g to -1.

public class Array2{
    public static void main (String args[] args){

    int[] g = new int[6];
    for (int index = 0; index < 6; index++){
        g[index] = -1;
    }
        System.out println("the elements of the array are: ")
        
        for(int index = 0; index < 6 imdex++){
            System.out.println(g[index]);
         }
}
}


c) Find the maximum of the first one hundred elements of floating point array c.

public class Array3{
    public static void main(String[] args){

    float[] c = new float[100];
    for(int index = 0; index < 100; index++){
        c[index] = index + 1;
    }

    float maximum = c[0];
    for(int index = 1; index < 100; index++){
        if (c[index] > maximum){
            maximum = c[index];
        }
    }
 

 } 

}


d)Copy a hundred-element array a into a hundred-element array b, but in reverse order.

public class Main {
    public static void main(String[] args) {

      int[] a = new int[100];
      int[] b = new int[100];
        for (int index = 0; index < 100; index++) {
            a[index] = index + 1;
        }
        for (int index = 0; index < 100; index++) {
            b[index] = a[99 - index];
        }
        System.out.println("Array b in reverse order:");
        for (int index = 0; index < 100; index++) {
            System.out.print(b[index] + " ");
        }
 }
}



e) Compute the product of the third to the tenth elements, both inclusive, in a hundred-
element integer array w.

public class Main {
    public static void main(String[] args) {

        int[] w = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int product = 1;

        for (int index = 2; index <= 9; index++) {
            product = product * w[index];
        }
            System.out.println("The product is: " + product);
  }
}




























































