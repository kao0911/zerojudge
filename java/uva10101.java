import java.util.Scanner;

public class uva10101 {
    private static final String[] UNITS = { "", "shata", "hazar", "lakh", "koti" };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNumber = 1;

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            System.out.printf("%4d. %s%n", caseNumber++, convertToBangla(number));
        }
    }

    private static String convertToBangla(long number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        long[] segments = new long[5];

        segments[4] = number / 10000000;
        number %= 10000000;
        segments[3] = number / 100000;
        number %= 100000;
        segments[2] = number / 1000;
        number %= 1000;
        segments[1] = number / 100;
        segments[0] = number % 100;

        if (segments[4] > 0) {
            result.append(convertSegment(segments[4])).append(" ").append(UNITS[4]).append(" ");
        }
        if (segments[3] > 0) {
            result.append(convertSegment(segments[3])).append(" ").append(UNITS[3]).append(" ");
        }
        if (segments[2] > 0) {
            result.append(convertSegment(segments[2])).append(" ").append(UNITS[2]).append(" ");
        }
        if (segments[1] > 0) {
            result.append(convertSegment(segments[1])).append(" ").append(UNITS[1]).append(" ");
        }
        if (segments[0] > 0 || result.length() == 0) {
            result.append(convertSegment(segments[0])).append(" ");
        }

        return result.toString().trim();//去掉字符串开头和结尾的空白字符
    }

    private static String convertSegment(long number) {
        if (number == 0) {
            return "";
        }
        return Long.toString(number);
    }
    
}



