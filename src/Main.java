public class Main {

    public static void main(String[] args) {

        int startMoney = 50;
        int payment = 1000;
        int bonus;
        int acc = startMoney + payment;

        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        System.out.println("На счету " + acc);
        System.out.println("Количество бонусов " + bonus);
    }
}