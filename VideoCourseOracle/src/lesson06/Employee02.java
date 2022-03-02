package Lesson06;

public class Employee02 {

  /*
  Вызов одного конструктора из другова конструктора.
  Все переменные сделал уникальными в каждом методе

  Конструктор не может вызвать внутри себя Overloaded по имени класса.
  Для этого используют оператор  this
  */

  Employee02(int id2, String surname2, int age2) {
    // this вызывает конструктор с 2 параметрами
    this(surname2, age2);
    id = id2;
  }

  Employee02(String surname3, int age3) {
    surname = surname3;
    age = age3;
  }

  Employee02(int id4, String surname4, int age4, double salary4, String department4) {
    this(id4, surname4, age4); // this вызов оверлоад должен стоять первым этот уже в 3 параметрами
    id = id4;
    salary = salary4;
    department = department4;
  }

  int id;
  String surname;
  int age;
  double salary;
  String department;
}

class EmployeeStarter02 {

  public static void main(String[] agrs) {
    Employee02 emp1 = new Employee02(1, "Ivan", 25);
    System.out.println(emp1.surname);
    Employee02 emp2 = new Employee02("Petrov", 30);
    System.out.println(emp2.department);
    Employee02 emp3 = new Employee02(2, "Spiridon", 40, 100.35, "IT");
    System.out.println(emp3.department);
  }
}

