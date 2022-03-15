package Lesson06;
// TODO полезные методы при работе с массивами Arrays.deepToString();

import java.util.Arrays;

/**
 * Arrays.toString(); Выводит на консоль содержимое массива которое вы передали
 * Arrays.deepToString(); Выводит на консоль содержание многомерного массива которое вы передали
 * Arrays.binarySearch();
 * System.arraycopy();
 */

public class Lesson_06_06_ArraysbinarySearch {
    public static void main(String[] args) {
        String[][] array = {{"один-один", "один-два", "Один-три"}, {"Два-один", "Два-два", "Два-Три"}};
        System.out.println(Arrays.deepToString(array));

    }
}
