package LessonUnderstood;

public class Employee03end {

  /*
  1:07
  https://www.udemy.com/course/java-oca-oracle/learn/lecture/12456760#overview
  Вызов одного конструктора из другова конструктора.
  Все переменные сделал уникальными в каждом методе

  Конструктор не может вызвать внутри себя Overloaded по имени класса.
  Для этого используют оператор  this
  */

  public Employee03end(int id2, String surname2, int age2) {
  /*
    Конструктор ссылается на тело с данными
    Employee03end(int id4, String surname4, int age4, double salary4, String department4)
    Но так как в этом конструторе нет данных по Зараплате salary
    и департаменту department то и значения становятся по  умолчанию.
    Для salary и String использовали значения по умолчанию 0.0, null
*/

    this(id2, surname2, age2, 0.0, null);
  }

  Employee03end(String surname3, int age3) {
   /*
    так же как и в предыдущем случае заменили значения которых нет на значения по умолчанию
    id типа int стало 0 double типа дроби стало 0.0 department типа String стала null
    */
    this(0, surname3, age3, 0.0, null);
  }

  /*
  Cначало пишем конструктор с самым длинным телом
  */

  Employee03end(int id4, String surname4, int age4, double salary4, String department4) {
    id = id4;
    surname = surname4;
    age = age4;
    salary = salary4;
    department = department4;

  }

  int id;
  String surname;
  int age;
  double salary;
  String department;
}

class EmployeeStarter03 {

  public static void main(String[] agrs) {
    Employee03end emp1 = new Employee03end(1, "Ivan", 25);
    System.out.println(emp1.surname);
    Employee03end emp2 = new Employee03end("Petrov", 30);
    System.out.println(emp2.department);
    Employee03end emp3 = new Employee03end(2, "Sviridov", 40, 100.35, "IT");
    System.out.println(emp3.department);
  }
}
