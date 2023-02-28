package tasks.task2;

import java.util.Scanner;

//разделить рулет на n число человек
public class Task2 {
    public static void getResult() {
        try (Scanner scanner = new Scanner(System.in)){
            int n = scanner.nextInt();
            int startRange = 1;
            int endRange = 2 * (int)Math.pow(10, 9);
            int k = 0;
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
                System.out.println(k);
            }
        }
    }
}
