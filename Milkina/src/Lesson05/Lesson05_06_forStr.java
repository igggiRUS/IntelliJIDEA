package Lesson05;

public class Lesson05_06_forStr {
    //TODO ЦИКЛ for искользуется когда мы знаем сколько чотка раз мы должны что то выполнить

    public static void main(String[] args) {
        char symbol = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(" " + symbol++);
        }
        System.out.println();
        char symbolCaps = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.print(" " + symbolCaps++);
        }
        System.out.println();

        char ruSymbol = 'а';
        for (int j = 0; j < 32; j++) {
            System.out.print(" " + ruSymbol++);
        }
        System.out.println();

        char ruSymbolCaps = 'А';
        for (int k = 0; k < 32; k++) {
            System.out.print(" " + ruSymbolCaps++);

        }
    }
}
