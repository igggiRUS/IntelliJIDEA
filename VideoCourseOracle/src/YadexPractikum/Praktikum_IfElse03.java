package YadexPractikum;
class Praktikum_IfElse03 {
    public static void main(String[] args) {

        double rateUSD = 78.5;
        double rateEUR = 85.5;
        double rubles = 14560.5;

        String currency = "USD";
        System.out.println("Вы конвертируете рубли в " + currency);
        // Если currency равно "USD", то конвертируем в доллары, иначе в евро
            if (currency.equals(rateUSD)) {
		    System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
		} else {
			System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
		}
    }
}