package com.njnu.kai;

/**
 * @author hongkai.qian
 * @version 1.0.0
 * @since 13-2-17
 */


public class Test {
    public static String readableByte(long bytes) {
        int unit = 1024;
        if (bytes < unit) return bytes + "B";
        int exp = (int) (Math.log(bytes) / Math.log(unit));
        char pre = "KMGTPE".charAt(exp - 1);
        return String.format("%.1f%cB", bytes / Math.pow(unit, exp), pre);
    }

    public static void main(String[] args) {
        System.err.println(Integer.parseInt("ca", 16));
        System.err.println(Integer.parseInt("d5", 16));
        short shortD5 = Short.parseShort("d5", 16);
        System.err.println(shortD5);
        System.err.println((byte)shortD5);
//        System.err.println(Integer.parseInt("0xca"));
    }
}
