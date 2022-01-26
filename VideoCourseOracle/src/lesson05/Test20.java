package lesson05;
public abstract class Test20 {
	// СОЗДАН МЕТОД "выполняемое действие" складывает 3 числа
	// метод summa типа int принадлежит классу test20
	int summa(int a, int b, int c) { // создан метод
		int result = a + b + c; // в теле создана переменная результат
		return result; // возвращает результат в метод
	}


	int srednArifmet(int a1, int b1, int c1); {
	int result2 = summa(a1,b1,c1)/3;
	return result2;
	}


}

// создаем новый класс
class Test21 {
	// внутри класса метод мейн отправная точка для работы тела программы
	public static void main(String[] agrs) {
		// `тип данных` Test20  `объект` t = `новый класс` new Test20();
		Test20 t = new Test20();
		// переменна summaTrexChisel которой присвоен ОБЪЕКТ "t"  c методом summa взятая из класса test20
                // int переменная = объект.метод(параметры АРГУМЕНТЫ);
		int summaTrexChisel = t.summa(10, 5, 12);
		System.out.println(summaTrexChisel);
                // в скобках АРГУМЕНТЫ - параметры
                System.out.println(t.summa(4, 12, 32));
	}
}