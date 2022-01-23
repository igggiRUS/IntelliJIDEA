package test;
public class Test20 {
    // СОЗДАН МЕТОД "выполняемое действие" складывает 3 числа
    // метод summa типа int принадлежит классу test20
    int summa(int a, int b, int c) {
        int xxx = a + b + c;
        return xxx;
    }
}

// создаем новый класс
class Test21 {
    // внутри класса метод мейн отправная точка для работы тела программы
    public static void main (String []agrs){
// вызов метода call
// переменная t = new Test20()
// переменной t присвоили класс test20 на основе которой он сделал новый объект
        Test20 t = new Test20();
        int summaTrexChisel  = t.summa(10, 5, 12);
        System.out.println(summaTrexChisel);
    }
}

