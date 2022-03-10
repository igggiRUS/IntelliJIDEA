package Lesson06;
// TODO Многомерный массив 23:18 Пример блока инициализации двумерного массива

/**
 * Многомерный массив
 * Многомерный это массив массивов
 * пример двухмерного массива с матрицей
 * Пример двухмерного массива с разной размерностью
 * Всегда указывается первая размерность остальные можно не указывать
 */
public class Lesson06_03_05_Array_2D {
    public static void main(String[] args) {
        double [][] arrayTwoD = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}
        };
        for (double[] arrayOneD : arrayTwoD) {
            for (double element : arrayOneD) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
