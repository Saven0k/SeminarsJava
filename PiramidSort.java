import java.util.Random;

public class PiramidSort {
    public static void main(String[] args) {
        int[] array = new int[100];
        fillArray(array);

        long StartTime = System.nanoTime();
        piramidSort(array);
        System.out.println("Time work: ");
        System.out.print(System.nanoTime() - StartTime);



    }
    public static void fillArray(int [] array){
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10000);
        }
    }

    public static void piramidSort(int[] array){
            
    }
}
