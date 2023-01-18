public class Main {
    public static void main(String[] args) {
        int initialAmount = 300;
        int depositAmount = 900;
        int bonuses;

        if (depositAmount > 1000) {
            bonuses = depositAmount / 100;
        } else {
            bonuses = 0;
        }

        int balance = initialAmount + depositAmount + bonuses;

        System.out.println("Ваш баланс: " + balance);
        System.out.println("Начислено бонусных рублей: " + bonuses);
    }
}