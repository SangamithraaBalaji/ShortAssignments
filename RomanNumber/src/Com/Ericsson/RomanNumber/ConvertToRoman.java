package Com.Ericsson.RomanNumber;

import java.util.HashMap;
import java.util.Scanner;

public class ConvertToRoman {

    private static HashMap<Integer, String> map = new HashMap<Integer, String>();
    private static int[] bases = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

    public String converter(int num) {
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(5, "V");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

        String result = new String();

        for (final int i : bases) {
            while (num >= i) {
                result += map.get(i);
                num -= i;
            }
        }
        return result;
    }

    public static void main(final String[] args) {
        final ConvertToRoman n = new ConvertToRoman();
        final Scanner sc = new Scanner(System.in);
        final int i = sc.nextInt();
        System.out.println(n.converter(i));

    }

}
