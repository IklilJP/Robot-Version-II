package com.enigma.goshling;

import java.util.Scanner;

public class Helper {
    private static Scanner sc = new Scanner(System.in);

    public static String inputString() {
        return sc.nextLine();
    }

    public static Integer stringToInt(String data) {
        return Integer.parseInt(data);
    }

    public static boolean checkCommand(String data) {
        String[] command = {"E", "N", "S", "W"};
        data = data.toUpperCase();
        for (String p : command) {
            if (data.equals(p)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkInteger(String data) {
        try {
            Integer.parseInt(data);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
