package tasks.task1;

import java.util.Scanner;

public class Task1 {

    public static void getResult() {
        try (Scanner scanner = new Scanner(System.in)){
            var tariffPlan = new TariffPlan(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println(tariffPlan.getSumForPay());

        }
    }

    public static void main() {
        short sumForPay = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            if (scanner.hasNextLine()) {
                short countInputData = 4;
                short[] arrIntData = new short[countInputData];
                String[] arrInputStrData = scanner.nextLine().split(" ");
                if (arrInputStrData.length == countInputData) {
                    for (int i = 0; i < countInputData; i++) {
                        short currentValue = Short.parseShort(arrInputStrData[i], 10);
                        if (currentValue > 0 && currentValue <= 100)
                            arrIntData[i] = currentValue;
                        else
                            throw new RuntimeException("Incorrect range data");
                    }
                } else {
                    throw new RuntimeException("Input only 4 integers");
                }
                sumForPay = arrIntData[0];
                if (arrIntData[1] < arrIntData[3]) {
                    sumForPay += arrIntData[2] * (arrIntData[3] - arrIntData[1]);
                }
            } else {
                throw new RuntimeException("Input correct data");
            }
        }

        System.out.println(sumForPay);

    }

}
