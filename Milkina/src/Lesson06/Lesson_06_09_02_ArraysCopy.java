package Lesson06;
// TODO полезные методы при работе с массивами Arrays.sort() копирование массива самого в себя

import java.util.Arrays;

/**
 * Arrays.toString(); Выводит на консоль содержимое массива которое вы передали
 * Arrays.deepToString(); Выводит на консоль содержание многомерного массива которое вы передали
 * Arrays.binarySearch(); -(position +1) позиция на кторой мог быть 25 это 2 +1 = 3 а так как такого числа в массиве нет ставить (-) и получаем -3
 * System.arraycopy(); Позволяет копировать из одного массива в другой
 * Arrays.sort(); Если нужно отсортировать элементы массива
 */


public class Lesson_06_09_02_ArraysCopy {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(array));
        // массив с позиции 1 копирует в позицию 3 на длинну 3
        System.arraycopy(array, 1, array, 3, 3);
        System.out.println(Arrays.toString(array));


    }
}
