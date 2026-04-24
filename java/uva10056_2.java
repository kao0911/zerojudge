import java.util.Locale;
import java.util.Scanner;

public class uva10056_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // 確保使用點作為小數點

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            double p = scanner.nextDouble();
            int k = scanner.nextInt();

            if (n == 0) {
                break;
            }

            if (p == 0.0) {
                System.out.printf("%.4f\n", 0.0);
            } else {
                double q = 1 - p;
                double denominator = 1 - Math.pow(q, n);
                if (denominator == 0) {
                    System.out.printf("%.4f\n", 0.0);
                } else {
                    double result = (p * Math.pow(q, k - 1)) / denominator;
                    System.out.printf("%.4f\n", result);
                }
            }
        }
    }
}
