package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sumForPay = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            int subscriptPayment = scanner.nextInt();
            int countMb = scanner.nextInt();
            int sumOneMbUpper = scanner.nextInt();
            int commonUsingMb = scanner.nextInt();

            sumForPay = subscriptPayment;
            if (countMb < commonUsingMb) {
                int countUpperMb = commonUsingMb - countMb;
                sumForPay += sumOneMbUpper * countUpperMb;
            }

            System.out.println(sumForPay);
        }

    }
}
