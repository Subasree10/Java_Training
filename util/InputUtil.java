package util;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner sc = new Scanner(System.in);

    public static Integer getInt(String msg) {
        System.out.print(msg);
        return Integer.valueOf(sc.nextLine());
    }

    public static Double getDouble(String msg) {
        System.out.print(msg);
        return Double.valueOf(sc.nextLine());
    }

    public static String getString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }
}