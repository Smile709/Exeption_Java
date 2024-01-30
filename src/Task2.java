/*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
        3. если вместо массива пришел null, метод вернет -3
        */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(findElemIndexInArray(new int[]{2,6,9,12,32},12,4));
    }
    public static int findElemIndexInArray (int[] arr, int elem, int minArrLength){
        if (arr == null) {
            System.out.println("Аргумент не может быть null");
            return -3;
        }
        if (arr.length < minArrLength) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==elem) return i;
        }
        return -2;
    }
}
