package YadexPractikum;
class Praktikum_IfElse06 {
        public static void main(String[] args) {

        double rubles = 14560.5;
        double rateUSD = 78.5;
        double rateEUR = 85.5;
        double rateJPY = 0.74; // Курс японской иены

        String currency = "DKK";
        System.out.println("Вы конвертируете рубли в " + currency);

        if (currency.equals("USD")) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else if (currency.equals("EUR")) {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        } else if (currency.equals("JPY")) {
            System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
        } else {
            System.out.println("Валюта не поддерживается.");
        }
    }
}



/*
Как мы ни старались, но в код прокралась ошибка! Вам предстоит её исправить: конвертация в иены работает,
но проблема возникает, если попытаться конвертировать в новую валюту, например, датскую крону — DKK. Программа в таком случае конвертирует в иены,
а хотелось бы получить сообщение об ошибке, ведь приложение пока не поддерживает такую валюту.
*/