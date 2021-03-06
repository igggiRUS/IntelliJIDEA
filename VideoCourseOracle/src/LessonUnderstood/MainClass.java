package LessonUnderstood;
/*
Создаем главный класс
класс MainClass то есть шаблон из которого будут изготавливаться объекты

1. class >>> класс это шаблон из которого делаются варианты объектов
             которые наполняются собственными значениями

            1.1 object
            1.2 object
            1.3 object
            1.4 object

Пример:
публичный класс названиеКласса { тело класса }
public class MainClass {}

В теле класса могут быть значения "переменные экземпляра шаблона" (instance variables) а может быть пустым
 СОЗДАЛИ переменные экземпляра класса но не присвоили им значения (instance variables)
*/

public class MainClass {

  //переменные экземпляра класса
  int id;
  String name;
  double balance;

  /*
  В классе должнен быть метод main это стартовая точка для запуска программы
  Вот начало программы откуда она начинает работать
  */
  public static void main(String[] agrs) {
        /*
            референсные ссылочные типы данных
             Так как это ссылочный тип данных (reference) то их может быть сколько угодно много (названий имен типов данных)
             создаем объект класса MainClass
             референсный(тип данных) переменная = значение ();
             new означает что будет создаваться новый объект
             все что идет после new это вызов конструктора MainClass();
             цель любого конструктора создать объект

        Референсными завают типы данных которые не содержат данные а содержат ссылки на область памяти в которой храняться данные
        Переменная хранит не сам объект а ссылку на данные

        | Тип данных референсный | переменная | присвоение | значение();      |
        | ---------------------- | ---------- | ---------- | ---------------- |
        | MainClass              | myAccount  | =          | new MainClass(); |
        | MainClass              | herAccount | =          | new MainClass(); |
        | MainClass              | hisAccount | =          | new MainClass(); |

        Аналоги

        | Тип данных | переменная | присвоение | значение(); |
        | ---------- | ---------- | ---------- | ----------- |
        | int        | a          | =          | 5;          |
        | String     | h          | =          | "Вася";     |



        Классу принадлежит переменная которой присвоено значение.
        Так как значение не присвоено то вызывается конструктор new MainClass(); создается новый объект

        После слова new обязательно идет вызов конструктора

        В памяти создались три объекта
        */

    // ссылке типа  присваивается новый объект(экземпляр) такого же типа, с использованием конструктора по-умолчанию
    MainClass myAccount = new MainClass();
    MainClass herAccount = new MainClass();
    MainClass hisAccount = new MainClass();
    // ненадо указывать тип переменных они уже указанны public class MainClass
    // у собаки может быть несоколько поводков но у несколькоих собак не омжет быть 1 поводок
    // у объекта может быть несколько переменных но у переменной не может быть несколько объектов
    myAccount.id = 1;
    myAccount.name = "Misha";
    myAccount.balance = 12.35;

    herAccount.id = 2;
    herAccount.name = "Oksana";
    herAccount.balance = 18.35;

    hisAccount.id = 3;
    hisAccount.name = "Valera";
    hisAccount.balance = 25.35;

    System.out.println("Мой баланс: " + myAccount.balance);
    System.out.println("Её баланс: " + herAccount.balance);
    System.out.println("Его баланс: " + hisAccount.balance);
  }
}
