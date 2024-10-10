package Array;

import java.util.Arrays;

public class Array {
    
    public static void main(String[] args) {
            int array1[] = {14,23,32,40,58};
            int array2[] =new int[5];
            System.arraycopy(array1,0, array2, 0, 5);
            System.out.println(Arrays.toString(array2));
    }
}
