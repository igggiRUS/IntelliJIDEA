package Lesson06;
// TODO Двумерный массив
/**
 * Многомерный массив
 * Многомерный это массив массивов
 * Могут быть 2 мерные 3 мерные и 10 мерные но ограничиваются 2 мерными
 * В двумерных массивах используется метод перебора for
 * 4 строки 5 столбцов 2 цикла for один вложен в другой
 */
public class Lesson06_03_01_multiArray {
    public static void main(String[] args) {
        int [][] twoD = new int [4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k++;
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
