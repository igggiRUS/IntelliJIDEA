package Lesson05;

public class Lesson05_07_ForEach {
    // TODO for-each искользуется когда надо перебрать все элементы массива

    /**
     * for-each (итеррационная_переменная: массив) {
     *     * операторы *
     * }
     * При проходении цикла переменной str автоматически присваивается значение,
     * равное следующему значению массива args
     */
    public static void main(String[] args) {
        for (String str : args) {
            System.out.println("значение" + str);
        }
    }
}

