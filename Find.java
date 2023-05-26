import java.util.Random;

public class Find {

    public static void main(String[] args) {
        int[] array = new int[10000];
        fillArray(array);

        long StartTime = System.nanoTime();
        binaryFind(array, 8, 0, 10000);
        System.out.println(System.nanoTime() - StartTime);

        long StartTime1 = System.nanoTime();
        find(array, 8);
        System.out.println(System.nanoTime() - StartTime1);

    }

    public static void fillArray(int [] array){
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10000);
        }
    }
        

    public static void bubbleSort(int[] array) {
        boolean finish = true;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);

    }

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int binaryFind(int[] array, int value, int min, int max){

        int midpoint;
        if( max < min){
            return -1;   
        }
        else{
            midpoint = (max - min)/2 +  min;
        }
        if(array[midpoint] < value){
            return binaryFind(array, value, midpoint + 1, max);
        } else{
            if( array[midpoint] > value){
                return binaryFind(array, value, min, midpoint - 1);
            } else{
                return midpoint;
            }
        }
        
    }
}