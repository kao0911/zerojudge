import java.util.Locale;
import java.util.Scanner;

public class uva10056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // 設定使用美式區域，確保使用點作為小數點分隔符

        while (scanner.hasNext()) { // 檢查是否有下一組輸入數據
            int n = scanner.nextInt();     // 讀取參與者的數量 n
            double p = scanner.nextDouble(); // 讀取每位參與者在其回合中獲勝的概率 p
            int k = scanner.nextInt();     // 讀取指定的參與者位置 k

            if (n == 0) { // 若 n 為 0，則結束輸入並退出循環
                break;
            }

            if (p == 0.0) { // 如果獲勝概率 p 為 0，則不可能獲勝，直接輸出 0.0000
                System.out.printf("%.4f\n", 0.0);
            } else {
                double q = 1 - p; // 計算未獲勝的概率 q = 1 - p
                double denominator = 1 - Math.pow(q, n); // 計算公式中的分母 1 - (1-p)^n

                if (denominator == 0) { // 如果分母為 0，意味著每輪都不會結束，直接輸出 0.0000
                    System.out.printf("%.4f\n", 0.0);
                } else {
                    // 計算指定參與者 k 獲勝的概率，根據公式：P = (p * (1 - p)^(k - 1)) / (1 - (1 - p)^n)
                    double result = (p * Math.pow(q, k - 1)) / denominator;
                    // 輸出結果，保留四位小數
                    System.out.printf("%.4f\n", result);
                }
            }
        }
    }
}

