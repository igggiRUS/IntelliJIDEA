package Lesson06;
// TODO Многомерный массив Пример двухмерного массива с разной размерностью

/**
 * Многомерный массив
 * Многомерный это массив массивов
 * пример двухмерного массива с матрицей
 * Пример двухмерного массива с разной размерностью
 * Всегда указывается первая размерность остальные можно не указывать
 */
public class Lesson06_03_03_Array {
    public static void main(String[] args) {
        int[][] array = new int[4][];
       // выделить память в строке 0 на 1 элемент
        array[0] = new int[1];
        // выделить память в строке 1 на 2 элемента
        array[1] = new int[2];
        // выделить память в строке 2 на 3 элемента
        array[2] = new int[3];
        // выделить память в строке 3 на 4 элемента
        array[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = k++;
                System.out.print(array[i][j] + " ");


            }
            System.out.println();
        }

    }
}
