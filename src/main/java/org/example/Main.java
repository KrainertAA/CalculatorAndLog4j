package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый операнд___");
        int i = scanner.nextInt();
        log.info("Первый операнд равен " + i);
        System.out.println("Введите второй операнд___");
        int y = scanner.nextInt();
        log.info("Второй операнд равен " + y);
        System.out.println("Введите один из операторов (* / - +)");
        String str = scanner.next();
        log.info("Оператор " + str);

        if (str.equals("*")) {
            System.out.println(i * y);
        } else if (str.equals("/")) {
            if (y == 0) {
                log.fatal("Критическая ошибка! Деление на ноль!");
                System.out.println("Ошибка! На 0 делить нельзя!");
            } else
                System.out.println(i / y);
        } else if (str.equals("-")) {
            System.out.println(i - y);
        } else if (str.equals("+")) {
            System.out.println(i + y);
        } else
            System.out.println("Вы ввели неверный оператор");
    }
}