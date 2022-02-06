package YadexPractikum;
class Praktikum_IfElse07 {
 public static void main(String[] args) {
    int age = 17;
String country = "USA";
String state = "Alaska";

if (age < 18) {
    if (country.equals("USA")) {
        if (state.equals("New York")) {
            System.out.println("Можете водить машину, но вам нельзя покидать пределы Нью-Йорка.");
        } else {
            System.out.println("Придётся подождать до 18 или переехать в Нью-Йорк.");
        }
    } else{
        System.out.println("Придётся подождать до 18.");
    }
} else {
    System.out.println("Можете водить где угодно.");
        } 
                                            }
                                }


// https://practicum.yandex.ru/trainer/java-developer/lesson/3da5185d-c6be-4aee-aa42-dfc8ecc3e439/task/aef4e487-aa0b-4153-8c9c-e8cf003a2fa7/