package day02;

import java.util.Scanner;

public class Task01Home_if {

  public static void main(String[] args) {
    System.out.println("Введите этажность дома");
    Scanner newIntInput = new Scanner(System.in);
    /*
    если  то 1.... иначе если то 2 ....
    иначе если то 3... иначе (во всех остальных случайях)...
    */
    int floorCount = newIntInput.nextInt(); // Количество этажей
    if (floorCount < 5) {
      System.out.println(floorCount + " С 1 по 4 малоэтажный");
    } else if (floorCount >= 5 && floorCount <= 8) {
      System.out.println("С 5 по 8 Средне этажный");
      // вписал условие  AND && логический оператор сравнения
    } else if (floorCount >= 9 && floorCount <= 16) {
      System.out.println("Многоэтажный");
    } else {
      System.out.println("Небоскреб");
    }
  }
}