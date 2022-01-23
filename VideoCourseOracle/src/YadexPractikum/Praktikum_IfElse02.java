package YadexPractikum;
class Praktikum_IfElse02 {
    // класс практикумИфЕлсе ПЕРВОЕ ВЛОЖЕНИЕ
    public static void main(String[] args) {
// паблик статик начало работы тела программы ВТОРОЕ ВЛОЖЕНИЕ
        double rateUSD = 78.5;
        double rubles = 14356.5;
        
        if (rateUSD > 70) {
            // начало работы оператора if ТРЕТЬЕ ВЛОЖЕНИЕ
            System.out.println("Отличный курс доллара — рекомендую купить!");
        }  // закрыто ТРЕТЬЕ ВЛОЖЕНИЕ
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } // закрыто ВТОРОЕ ВЛОЖЕНИЕ сама программа
} 
// закрыто ТРЕТЬЕ ВЛОЖЕНИЕ класс