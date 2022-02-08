package day1;

import java.util.Scanner;

public class Input {

  public static void main(String[] args) {
    // класс сканер зарезервирован он считывает консоль
    Scanner g = new Scanner(System.in);
    System.out.println("Введи данные с клавы:");
    String string = g.nextLine();
    System.out.println("вы ввели " + string);
  }
}
