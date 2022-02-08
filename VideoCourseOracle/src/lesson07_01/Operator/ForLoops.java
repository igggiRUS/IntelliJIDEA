package lesson07_01.Operator;

public class ForLoops {

  public static void main(String[] args) {
    /*
     for (1;2;3);
    1. Блок декларируется инициализируется переменная счетчик
    2. Блок условие до каких пор будет исполняться счетчик
    3. Блок что делать с 1 блоком после каждого цикла (итерации) после каждого повтора
    */
    for (int i = 0; i <= 10_000; i++) {
      System.out.println("Hello" + " " + i);
    }
  }
}
