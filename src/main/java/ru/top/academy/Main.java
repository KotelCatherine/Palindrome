package ru.top.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;

        try (Scanner scanner = new Scanner(System.in)) {
            str = scanner.nextLine();
            str = str.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        }

        AbstractCheckString checkString = new CheckString();
        checkString.setStr(str);
        System.out.println(checkString.resultIsChecking());
    }
}