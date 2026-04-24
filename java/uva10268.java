import java.util.ArrayList;
import java.util.Scanner;

public class uva10268 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 使用 hasNextLine 檢查是否有下一行輸入
        while (scanner.hasNextLine()) {
            int x = Integer.parseInt(scanner.nextLine().trim());  // 讀取 x 的值並將其轉換為整數
            String[] coefficients = scanner.nextLine().trim().split("\\s+"); // 讀取多項式係數並拆分成數組

            // 儲存所有係數
            ArrayList<Integer> polyCoefficients = new ArrayList<>();
            for (String coefficient : coefficients) {
                polyCoefficients.add(Integer.parseInt(coefficient)); // 將每個係數轉換為整數並添加到 ArrayList
            }

            // 計算多項式的一階導數在 x 點的值
            int degree = polyCoefficients.size() - 1;  // 多項式的最高次數，等於係數數量減 1
            int result = 0;  // 導數結果初始化為 0

            // 計算導數
            for (int i = 0; i < degree; i++) {
                result += polyCoefficients.get(i) * degree * Math.pow(x, degree - 1);  // 計算導數的值
                degree--;  // 次數減 1
            }

            // 輸出結果
            System.out.println(result);
        }

        scanner.close(); // 關閉 Scanner
    }
}
