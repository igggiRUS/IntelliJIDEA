package day02;

import java.util.Scanner;

public class Task02Lesson07_Scanner {

  public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Введите любой текст или значение");
    String stringWord = s1.nextLine();
    System.out.println("вы ввели " +stringWord);
  }
}
