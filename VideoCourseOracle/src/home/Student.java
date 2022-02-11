package home;

public class Student {

  // instance переменные экземпляра
  int studentTicket;
  String name;
  String sureName;
  short yearOfAdmission;
  byte avgEconomics;
  byte avgMathematics;
  byte avgForeign;

  static class StudentAverage {

    public static void main(String[] args) {

      Student s1 = new Student();
      /*
      Вызывается конструктор new для создания объекта Student()
      на основе класса Student и присваивается референсная ссылка s1
      указывающая на значения экзепляра s1 в теле класса StudentAverage
      Значения s1 создаются на осное instance переменных
            name,
            sureName,
            yearOfAdmission,
            avgEconomics,
            avgMathematics,
            avgForeign,
      указанных в теле класса Student к которым обращается ссылка s1 на основе конструктора объекта
      */
      Student s2 = new Student();
      Student s3 = new Student();
      Student s4 = new Student();

      s1.name = "Mihail";
      s1.sureName = "Bez";
      s1.yearOfAdmission = 1979;
      s1.avgEconomics = 2;
      s1.avgMathematics = 5;
      s1.avgForeign = 5;
      int i1 = (s1.avgEconomics + s1.avgMathematics + s1.avgForeign) / 3;
      System.out.println(i1);

      s2.studentTicket = 2;
      s2.name = "Olga";
      s2.sureName = "Cirl";
      s2.yearOfAdmission = 1983;
      s2.avgEconomics = 3;
      s2.avgMathematics = 4;
      s2.avgForeign = 4;
      int i2 = (s2.avgEconomics + s2.avgMathematics + s2.avgForeign) / 3;
      System.out.println(i2);

      s3.studentTicket = 3;
      s3.name = "Aleksa";
      s3.sureName = "Min";
      s3.yearOfAdmission = 1989;
      s3.avgEconomics = 5;
      s3.avgMathematics = 5;
      s3.avgForeign = 5;
      int i3 = (s3.avgEconomics + s3.avgMathematics + s3.avgForeign) / 3;
      System.out.println(i3);

      s4.studentTicket = 4;
      s4.name = "Oksana";
      s4.sureName = "yak";
      s4.yearOfAdmission = 1989;
      s4.avgEconomics = 1;
      s4.avgMathematics = 3;
      s4.avgForeign = 2;
      int i4 = (s4.avgEconomics + s4.avgMathematics + s4.avgForeign) / 3;
      System.out.println(i4);
    }
  }
}





