package com.Ericsson.Roman_Numerals;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNumerals {

    private static int[] bases = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static HashMap<Integer, String> map = new HashMap<Integer, String>();

    private static void Setup() {
        map.put(0, "N");
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }

    public String converter(int num) {
        Setup();
        if (num == 0) {
            return map.get(0);
        } else if (num < 0) {
            return "Invalid input";
        } else {
            String result = new String();
            for (final int i : bases) {
                while (num >= i) {
                    result += map.get(i);
                    num -= i;
                }
            }
            return result;
        }
    }

    public static void main(final String[] args) {
        System.out.println("Enter the number : ");
        try {
            final Scanner sc = new Scanner(System.in);
            final int no = sc.nextInt();
            final RomanNumerals in = new RomanNumerals();
            final int value = no;
            final String sd = in.converter(value);
            System.out.println(value + " ---> " + sd);
        } catch (final Exception e) {
            System.out.println(e);
        }

        System.out.println("xxxxxxxxxxxxxxxxxxxxx End of Program xxxxxxxxxxxxxxxxxxxx");
    }

}
