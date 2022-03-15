package Lesson06;
// TODO полезные методы при работе с массивами Arrays.sort();

import java.util.Arrays;

/**
 * Arrays.toString(); Выводит на консоль содержимое массива которое вы передали
 * Arrays.deepToString(); Выводит на консоль содержание многомерного массива которое вы передали
 * Arrays.binarySearch();
 * System.arraycopy();
 * Arrays.sort(); Если нужно отсортировать элементы массива
 */


public class Lesson_06_07_ArraysSort {
    public static void main(String[] args) {
        int[] array = new int[]{21, 3, 15, 5};
        Arrays.sort(array); // сортирует
        System.out.println(Arrays.toString(array));// возвращает строку и передает в soup
    }
}
