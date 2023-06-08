// First task

import com.apple.dnssd.ResolveListener;

class Sem1{
    public static void main(String[] args){
        // //First exception
        // String n = null;
        // System.out.println(n.length());
        
        // //Second exception  
        
        // String g = "123qwe";
        // int g1 = Integer.parseInt(g);
        // System.out.println(g1);
        
        // //Therd exception
        // Print();
        
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{2,3,3,4};
        // int[] arr2 = new int[]{2,3,4};
        // int[] arr2 = null;

        
        try{
            System.out.println(Pr(arr1, arr2));
        } catch (RuntimeException exception){
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }


    }
    
    
    public static void Print(){
        System.out.println("Hello world");
        Print();
    }


    //Second task

    // public static int sum2d(String[][] arr){
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < 5; j++) { 
    //             int val = Integer.parseInt(arr[i][j]); 
    //             sum += val;
    //         } 
    //     } 
    //     return sum; 
    // }
    
// Выход за рамки массива ,  если мы передадим неправильное значение при вызове функции то будет ошибка , ява не сможет строчку с непомнятными символами перевести в Integer


//Third task

    public static int[] Pr(int[] arr1, int[] arr2) {
            

            if (arr1 != null && arr2 != null){
                if(arr1.length != arr2.length) {
                throw new RuntimeException("Arrays are not equal");
                } else {
                    int len = arr1.length;
                    int[] result = new int[len];
                    for (int i = 0; i < len; i++) {
                        result[i] = arr1[i] * arr2[i];  
                    }
                    return result;
                }
            } else {
                throw new RuntimeException("Some array is null");
            }
            
        }
        












}
