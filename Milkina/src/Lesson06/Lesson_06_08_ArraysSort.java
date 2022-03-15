package Lesson06;
// TODO полезные методы при работе с массивами Arrays.binarySearch();

import java.util.Arrays;

/**
 * Arrays.toString(); Выводит на консоль содержимое массива которое вы передали
 * Arrays.deepToString(); Выводит на консоль содержание многомерного массива которое вы передали
 * Arrays.binarySearch(); -(position +1) позиция на кторой мог быть 25 это 2 +1 = 3 а так как такого числа в массиве нет ставить (-) и получаем -3
 * System.arraycopy();
 * Arrays.sort(); Если нужно отсортировать элементы массива
 */


public class Lesson_06_08_ArraysSort {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        // перед тем как узнать позицию в массиве надо его отсортировать.
        int pos1 = Arrays.binarySearch(array, 20);
        int pos2 = Arrays.binarySearch(array, 25);
        System.out.println(pos1);
        System.out.println(pos2);
    }
}
