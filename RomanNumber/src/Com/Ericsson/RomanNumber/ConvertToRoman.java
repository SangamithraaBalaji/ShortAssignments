package Com.Ericsson.RomanNumber;

import java.util.HashMap;
import java.util.Scanner;

public class ConvertToRoman {

    private static HashMap<Integer, String> map = new HashMap<Integer, String>();

    public String converter(final int i) {
        map.put(1, "I");
        map.put(5, "V");
        return map.get(i);
    }

    public static void main(final String[] args) {
        final ConvertToRoman n = new ConvertToRoman();
        final Scanner sc = new Scanner(System.in);
        final int i = sc.nextInt();
        System.out.println(n.converter(i));

    }

}
