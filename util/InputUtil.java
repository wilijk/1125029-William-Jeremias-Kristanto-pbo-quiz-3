package util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner sc = new Scanner(System.in);

    public static int readIInt() {
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    public static String readLine() {
        return sc.nextLine();
    }
}
