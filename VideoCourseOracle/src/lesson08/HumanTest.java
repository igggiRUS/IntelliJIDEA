package lesson08;
// вызали класс
public class HumanTest {
// вызали ссылку на объект
  public static void main(String[] args) {
    // создан новый объект на основе переменной h1
    // слово new указывает на создание нового объекта(экземпляра) класса Human ()
    // h1 пульт управления на нем кнопки age name

    Human h1 = new Human (25, "Михаил");
    System.out.println(h1.name);
    // static статические объекты принадлежат только классам а не объектам
    System.out.println(Human.hight);
  }

}
