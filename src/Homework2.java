import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 6, 1, 2, 8};
        int[] array1 = new int[]{-3, 60, -1, 32, 8};
        String str = "3 6 1 2 8";
        //Задание #1
        SumOfPrimeNum(array); // 1 метод
        SumOfPrimeNum2(str); // 2 метод
        //Задание #2
        boolean m = increasingNum(array); // 1 метод
        System.out.println(m);
        boolean n = increasingNum2(str); // 2 метод
        System.out.println(n);
        //Задание #3
        replaceOfNegativeNum(array1);
    }

    //1) Дана последовательность N целых чисел. Найти сумму простых чисел.
    public static void SumOfPrimeNum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 1; j <= array[i]; j++) {
                if (array[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum = sum + array[i];
            }
        }System.out.println(sum);
    }
    public static void SumOfPrimeNum2(String str){
        String[] array = str.split(" ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            int number = Integer.parseInt(array[i]);
            for (int j = 1; j <= number; j++) {
                if (number % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum = sum + number;
            }
        }System.out.println(sum);
    }

    //2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
    public static boolean increasingNum(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]){
                return false;
            }
        }return true;
    }

    public static boolean increasingNum2(String str){
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            int number = Integer.parseInt(array[i]);
            int number2 = Integer.parseInt(array[i+1]);
            if(number > number2){
                return false;
            }
        }return true;
    }

    //3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
    public static void replaceOfNegativeNum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 9 & array[i] < 100){
                sum = sum + i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                array[i] = sum;
            }
        }
        System.out.println(Arrays.toString(array));
    }


}
