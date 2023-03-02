package tasks.task2;

import java.util.Scanner;

//разделить рулет на n число человек

public class Task2 {

    //PT
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

    public static void getResultGood() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numberOfCuts  = 0;
        for(int piecesInCutPiece  = n; piecesInCutPiece != 1; piecesInCutPiece = piecesInCutPiece / 2 + piecesInCutPiece % 2)
            numberOfCuts++;

        //Вывод данных
        System.out.println(numberOfCuts);
    }

}
