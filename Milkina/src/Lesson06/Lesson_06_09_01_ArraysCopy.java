package Lesson06;
// TODO полезные методы при работе с массивами Arrays.sort() копирование массива

import java.util.Arrays;

/**
 * Arrays.toString(); Выводит на консоль содержимое массива которое вы передали
 * Arrays.deepToString(); Выводит на консоль содержание многомерного массива которое вы передали
 * Arrays.binarySearch(); -(position +1) позиция на кторой мог быть 25 это 2 +1 = 3 а так как такого числа в массиве нет ставить (-) и получаем -3
 * System.arraycopy(); Позволяет копировать из одного массива в другой
 * Arrays.sort(); Если нужно отсортировать элементы массива
 */


public class Lesson_06_09_01_ArraysCopy {
    public static void main(String[] args) {
        int[] arraySource = {1, 2, 3, 4, 5, 6};
        int[] arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("arraySource" + Arrays.toString(arraySource));
        System.out.println("arrayDestination" + Arrays.toString(arrayDestination));
// Начали копирование с позиции 1 копировали в позицию 2 и цифра 3 колличество эллементов которое копируется
        System.arraycopy(arraySource, 1, arrayDestination, 2, 3);
        System.out.println("arrayDestination after ArrayCopy: " + Arrays.toString(arrayDestination));
    }
}
