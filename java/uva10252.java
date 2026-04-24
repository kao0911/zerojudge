/*import java.util.*;

public class uva10252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine().toLowerCase();
            String s2 = sc.nextLine().toLowerCase();
            System.out.println(commonPermutation(s1, s2));
        }
    }

    private static String commonPermutation(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count frequency of each character in s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        // Count frequency of each character in s2 
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(String.valueOf((char)('a' + i))).repeat(Math.min(freq1[i], freq2[i]));
        }

        return sb.toString();
    }
}*/
import java.util.Arrays;
import java.util.Scanner;

public class uva10252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            // Convert both strings to char arrays
            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();

            // Sort both char arrays
            Arrays.sort(chars1);
            Arrays.sort(chars2);

            // Use two pointers to find the common characters
            StringBuilder common = new StringBuilder();
            int i = 0, j = 0;
            while (i < chars1.length && j < chars2.length) {
                if (chars1[i] == chars2[j]) {
                    common.append(chars1[i]);
                    i++;
                    j++;
                } else if (chars1[i] < chars2[j]) {
                    i++;
                } else {
                    j++;
                }
            }

            // Output the common characters
            System.out.println(common.toString());
        }

        scanner.close();
    }
}
