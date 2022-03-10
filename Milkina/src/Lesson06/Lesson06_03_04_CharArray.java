package Lesson06;
// TODO Многомерный массив 19:50 6-5

/**
 * Многомерный массив
 * Многомерный это массив массивов
 * пример двухмерного массива с матрицей
 * Пример двухмерного массива с разной размерностью
 * Всегда указывается первая размерность остальные можно не указывать
 */
public class Lesson06_03_04_CharArray {
    public static void main(String[] args) {
        char symbol = 'a';
        String [][] array = new String[4][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = symbol + "" + (j + 1);
                System.out.print(array[i][j] + " ");
            }
            symbol++;
            System.out.println();
        }

    }
}
