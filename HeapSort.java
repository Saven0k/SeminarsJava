import java.util.Random;

public class HeapSort {
    // 2 * i + 1   2 * I + 2
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);

        for (int i = array.length / 2 - 1; i>=0; i++ ) {
            HS(array, i, array.length);
        }
        for (int i = array.length - 1; i >=0; i--) {
            int ttemp = array[0];
            array[0] = array[i];
            array[i] = ttemp;

            HS(array, 0 , i);
        }

    }

    public static void fillArray(int [] array){
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10000);
        }
    }
    
    public static void HS(int[] array, int index, int root){
        int max = index;
        int leftB = (2 * index) + 1;
        int rightB = (2 * index) + 1;
        
        if (leftB < root) {
            max = leftB;
        }
        if (rightB < root) {
            max = rightB;
        }
        if (max != root) {
            int temp = array[index];
            array[index] = array[max];
            array[max] = temp;
            HS(array, max, root);
        }

    }
}   