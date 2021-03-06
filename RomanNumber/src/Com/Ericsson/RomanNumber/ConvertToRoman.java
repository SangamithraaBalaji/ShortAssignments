package Com.Ericsson.RomanNumber;

import java.util.HashMap;
import java.util.Scanner;

public class ConvertToRoman {

    private static HashMap<Integer, String> map = new HashMap<Integer, String>();
    private static int[] bases = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

    public String converter(int num) {
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

        String result = new String();

        if (num <= 0) {
            return "Invalid Input. Enter number greater than 0";
        } else {
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
        final ConvertToRoman n = new ConvertToRoman();

        try {
            final Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to convert: ");
            final int i = sc.nextInt();
            System.out.println(n.converter(i));
        } catch (final Exception e) {
            System.out.println("Invalid Input. Only numbers allowed");
        }

    }

}
