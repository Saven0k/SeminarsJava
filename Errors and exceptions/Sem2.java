import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sem2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //1
        // Safe();
        //4
        try{
            System.out.println("Введите строчку: ");
            String line = scanner.nextLine();
            System.out.println(NotNullString(line));
        } catch (RuntimeException e ){
            System.out.println("Пустые строчки передавать нельзя введите строчку заново. Введите строчку заново: ");
            String line1 = scanner.nextLine();
            System.out.println(NotNullString(line1));
        }
    }


    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void Safe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите дробное число");
        String line = scanner.nextLine();
        try{
            float f = Float.parseFloat(line);
            FloatChange(f);
             
        } catch(Exception e){
            System.out.println("Это не дробное число, повторите поппытку: ");
            float a =  scanner.nextFloat();
            FloatChange(a);
        }

        
    }
    
    public static void FloatChange(float n){
        System.out.println(n);
    }




    //Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    public void Zd3(){
        try {
            int d = 0;
            int[] intArray = new int[]{5,5,5,5,5,5,5,5};
            double catchedRes1 = intArray[8] / d; // Сама java нам показывает что так сделать нельзя, потому что intArray  нельзя преобразовать в переменную.Нужно наверное создать создать intArray 
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    //Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    
    // public static void main(String[] args) throws Exception {
    //     try {
    //         int a = 90;
    //         int b = 3;
    //         System.out.println(a / b);
    //         printSum(23, 234);
    //         int[] abc = {1 , 2};
    //         // abc[0] = 1;
    //         // abc[1] = 2;
    //         abc[3] = 9;
    //         // Вроде тут все ошибки обрабатывые первый catch Throwable
    //     } catch (Throwable ex) {
    //         System.out.println("Что-то пошло не так...");
    //     }
    // }
    // public static void printSum(Integer a, Integer b){ // 
    //     System.out.println(a + b);
    // }



    //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя. 
    // Далее запросить повторный ввод строки
    
    public static String NotNullString(String line){
        if (line.isEmpty()){
            throw new RuntimeException("Пустые строки вводить нельзя");
        }else {
            return line;
        }
    } 
}