package lesson08;

// класс с полямы создали пакет
public class Human {

  int age;
  String name;
  // статическая переменная не относится к объекту она пренадлежит классу
  // статик это настоящая дверь дома а не чертеж
  static int hight = 180;

  // созда конструктор
  Human (int age, String name) {
   // к этом объекту применяем параметры переменной что бы не создавать age2 name2
   this.age = age;
   this.name = name;

  }

}

