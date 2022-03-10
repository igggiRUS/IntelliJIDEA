package Lesson06;
// TODO Многомерный массив 27:00 двумерный массив чар

/**
 * тут пусто
 *   char [][] array = {{}, {}, {}, {}};
 */
public class Lesson06_03_06_Array_char {
    public static void main(String[] args) {
        char [][] array = {{'a', 'b'},
                {'c', 'd'},
                {'e', 'f'},
                {'j', 'k'}};
        for (char[] row : array){
            for (char element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
