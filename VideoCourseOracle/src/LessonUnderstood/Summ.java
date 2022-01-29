package LessonUnderstood;

public class Summ {

  /*
    СОЗДАН МЕТОД (действие)
    в теле создана переменная результат
    */
  int summaMethod(int a, int b, int c) {
    int result = a + b + c;
    return result;
  }
}

  class SumChisel {

    public static void main(String[] args) {
      Summ slozhenie = new Summ();
      int SummaTrehChisel = slozhenie.summaMethod(1, 2, 3);
      System.out.println(SummaTrehChisel);
    }
  }