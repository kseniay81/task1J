// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
int amountTicket = 16800;
int amountOneMiles = 20;
        System.out.println("Стоимость билета" + amountTicket + "руб.");
        System.out.println("Бонусная программа - за каждые 20 рублей, потраченные на билет, начисляется 1 миля.");
        int bonusMiles = amountTicket / amountOneMiles;
        System.out.println("Итоговый бонус" + bonusMiles + "миль." );

    }
}