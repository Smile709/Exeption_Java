/*Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.*///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(checkArrayLength(new int[]{1,14,14,543,23,43,65,1}, 7));
    }
    public static int checkArrayLength(int[] arr, int lenMin){
        if (arr.length < lenMin) return -1;
        return arr.length;
    }
}