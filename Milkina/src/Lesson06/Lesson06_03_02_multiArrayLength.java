package Lesson06;
// TODO Многомерный массив c размером length
/**
 * Многомерный массив
 * Многомерный это массив массивов
 * Могут, быть 2 мерные 3 мерные и 10 мерные, но ограничиваются 2 мерными
 * В двумерных массивах используется метод перебора for
 * 4 строки 5 столбцов 2 цикла for один вложен в другой
 * (j+1) строка 18 начало отсчета не с нуля, а с единицы
 * array.length размер первый
 * array[0].length размер второй в первом указан нуль.
 */
public class Lesson06_03_02_multiArrayLength {
    public static void main(String[] args) {
        char symbol = 'а';
        String[][] array = new String[4][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = symbol + "" + (j + 1);
                System.out.print(array[i][j] + " ");
            }
            symbol++;
            System.out.println();
        }
    }
}
