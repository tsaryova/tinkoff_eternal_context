package tasks.task2;

import java.util.Scanner;

//разделить рулет на n число человек
//частичное решение по тестам тинькофф. PT
public class Task2 {

    public static void getResult() {
        int k = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextLine()) {
                int n = Integer.parseInt(scanner.nextLine());
                int startRange = 1;
                int endRange = 2 * (int)Math.pow(10, 9);
                int countParts = 1;
                if (n >= startRange && n <= endRange) {
                    if (n == 1) {
                        k = 0;
                    } else {
                        while ( countParts < n) {
                            k++;
                            countParts *= 2;
                        }
                    }
                } else {
                    throw new RuntimeException("Incorrect data");
                }
            } else {
                throw new RuntimeException("Incorrect data");
            }
        }
        System.out.println(k);
    }

}
