public class Main {
    public static void main(String[] args) {

        int rub = 50;
        int refil = 10_000;

        int balance;
        int bonus;

        if (refil >= 1000) {

            bonus = refil / 100;
            balance = bonus + rub + refil;

            System.out.println("Колличество бонусов:" + bonus);
            System.out.println("Итоговый счет:" + balance);
        } else {

            balance = rub + refil;

            System.out.println("Бонусы не начислены");
            System.out.println("Итоговый счет:" + balance);
        }

    }
}
