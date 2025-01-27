package input;

import java.util.Scanner;


public class Input {

    private static int anInt;
    private static float aFloat;

    private static void getInt () {
        Scanner scanner = new Scanner(System.in);
        anInt = scanner.nextInt();
    }

    private static void getFloat() {
        Scanner scanner = new Scanner(System.in);
        aFloat = scanner.nextFloat();
    }

    private static int getTheInt() {
        return anInt;
    }

    private static float getTheFloat () {
        return aFloat;
    }

    public int getOptionMenu() {
        getInt();
        return getIntValue();
    }

    public int getIntValue() {
        getInt();
        return getTheInt();
    }

    public float getFloatValue() {
        getFloat();
        return getTheFloat();
    }
}
