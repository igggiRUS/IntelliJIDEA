package Lesson06;
// TODO МАССИВ группа однотипных переменных

/**
 * форма записи тип [массив] имя переменной
 * выделение памяти под массив
 * имя переменно = new тип [размер];
 *        первый массив имеет 3 эл второй 45 массив после объявления изменить нельзя
 *        args = new String[3];
 *         int [] values = new int[45];
 */
/*
В низу представлена сокращенная правильная форма записи
int [] monthDays = new  int[12];
 monthDays [0] = 31;
 monthDays [1] = 28;
 monthDays [2] = 31;
 monthDays [3] = 30;
 monthDays [4] = 31;
 monthDays [5] = 30;
 monthDays [6] = 31;
 monthDays [7] = 31;
 monthDays [8] = 30;
 monthDays [9] = 31;
 monthDays [10] = 30;
 monthDays [11] = 31;
 данный блок можно записать другим способом
 */

public class Lesson06_02_01_array {
    public static void main(String[] args) {
        int [] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println( "В апреле " + monthDays [3] + " дней");

    }
}
