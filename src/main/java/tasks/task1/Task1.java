package tasks.task1;

import java.util.Scanner;

public class Task1 {

    public static void getResult() {
        try (Scanner scanner = new Scanner(System.in)){
            var tariffPlan = new TariffPlan(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println(tariffPlan.getSumForPay());

        }
    }

}
