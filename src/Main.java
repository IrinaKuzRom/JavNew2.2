import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int entireAmount;
        System.out.print("Сколько у вас сейчас денег на счету? ");
        int moneyInAccount = in.nextInt();
        System.out.print("У вас на счету: " + moneyInAccount + " рублей \n");

        System.out.print("Введите сумму, на которую хотите пополнить счёт: ");
        int depositAmount = in.nextInt();

        System.out.printf("Вы пополнили счет на: %d \n", depositAmount);
        if (depositAmount <= 1000) {
            entireAmount = moneyInAccount + depositAmount;
            System.out.print("Бонусов нет. У вас на счету: " + entireAmount + " рублей \n");
        } else {
            int bonus = depositAmount / 100;
            entireAmount = moneyInAccount + depositAmount + bonus;
            System.out.print("Бонус равен: " + bonus + " рублям. У вас на счету: " + entireAmount + " рублей \n");
        }
        in.close();
    }
}
