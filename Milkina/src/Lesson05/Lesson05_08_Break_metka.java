package Lesson05;
// TODO Где метка это имя метки, обозначающее блок кода. 4:37 видео пересмотри урок запиши про  метки

/**
 * Им может быть как самостоятельный блок кода, так и целевой блок другого оператора.
 * Метка это любой допустимый в java идентификатор с двоеточием.
 * Может использоват ься в качестве цивилизованной формы оператора goto
 */

public class Lesson05_08_Break_metka {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("перед break");
                }
                if (t) {
                    break second;
                }
                System.out.println("этот код не будет выполен.");
            }
            System.out.println("этот код не будет выполен.");
        }
        System.out.println("после второго блока");
        System.out.println("после второго блока");
    }
}
