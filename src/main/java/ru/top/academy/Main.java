package ru.top.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;

        try (Scanner scanner = new Scanner(System.in)) {
            str = scanner.nextLine();
        }

        AbstractCheckString checkString = new CheckString();
        checkString.setStr(str);
        System.out.println(checkString.checkResult());
    }
}
