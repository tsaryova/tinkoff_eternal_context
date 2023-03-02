package tasks.task3;

import java.util.Scanner;

//по тестам тинрькофф - частичное решение. PT
//У Кати насыщенный день на работе.
// Ей надо передать n разных договоров коллегам.
// Все встре- чи происходят на разных этажах, а между этажами можно перемещаться только по лестничным пролетам — считается, что это улучшает физическую форму сотрудников.
// Прохождение каждого пролета занимает ровно 1 минуту

public class Task3 {
    public static void getResult() {
        short countSpendMinutes = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextLine()) {
                String[] str_n_t = scanner.nextLine().split(" ");
                if (str_n_t.length != 2)
                    throw new RuntimeException("Incorrect data");

                byte n = Byte.parseByte(str_n_t[0]);
                byte t = Byte.parseByte(str_n_t[1]);
                byte[] floors = new byte[n];
                byte startRange = 2;
                byte endRange = 101;

                if (n < startRange || t < startRange
                        || n > endRange || t > endRange) {
                    throw new RuntimeException("Incorrect data");
                }

                if (scanner.hasNextLine()) {
                    String[] floorsStr = scanner.nextLine().split(" ");
                    if (floorsStr.length == n) {
                        byte prevValue = 0;
                        for (byte i = 0; i < n; i++) {
                            byte currentValue = Byte.parseByte(floorsStr[i]);
                            if (currentValue > 0 && currentValue < endRange) {
                                if (i == 0 || currentValue > prevValue) {
                                    floors[i] = currentValue;
                                    prevValue = currentValue;
                                } else
                                    throw new RuntimeException("Incorrect data");
                            }
                            else
                                throw new RuntimeException("Incorrect data");
                        }
                    } else {
                        throw new RuntimeException("Incorrect data");
                    }

                    if (scanner.hasNextLine()) {
                        byte numPerson = Byte.parseByte(scanner.nextLine());

                        if (numPerson > 0 && numPerson <= floors.length) {
                            byte subMinMax = (byte) (floors[floors.length - 1] - floors[0]);
                            byte subWithMin = (byte) (floors[numPerson - 1] - floors[0]);
                            byte subWithMax = (byte) (floors[floors.length - 1] - floors[numPerson - 1]);
                            if (subWithMin < t || subWithMax < t) {
                                countSpendMinutes = subMinMax;
                            } else {
                                short toUpFloors = (short) (subMinMax + subWithMin);
                                short toDownFloors = (short) (subMinMax + subWithMax);
                                countSpendMinutes = (toUpFloors <= toDownFloors) ? toUpFloors : toDownFloors;
                            }
                        } else {
                            throw new RuntimeException("Incorrect data");
                        }

                    } else {
                        throw new RuntimeException("Incorrect data");
                    }

                } else {
                    throw new RuntimeException("Incorrect data");
                }
            } else {

                throw new RuntimeException("Incorrect data");
            }
        }
        System.out.println(countSpendMinutes);
    }
}
