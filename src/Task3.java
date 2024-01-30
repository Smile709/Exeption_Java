/*Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.*/

public class Task3 {
    static int [][] ints = new int[][]{
            {1, 0, 1, 1, 2},
            {1, 0, 1, 1, 1},
            {1, 0, 2, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1}
    };
    public static void main(String[] args) {
        System.out.println(summArrEllems(ints));
    }
    public static int summArrEllems(int[][] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length!=arr.length) throw new RuntimeException("Массив не квадратный");
            for (int j = 0; j < arr.length; j++) {
                int elem = arr[i][j];
                if (elem!=1 && elem!=0) {
                    System.out.println(temp);
                    throw new RuntimeException("Должен быть 0 или 1");
                }
                temp+=elem;
            }
        }
        return temp;
    }
}
