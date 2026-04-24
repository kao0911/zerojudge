import java.util.Scanner;

public class uva10170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            long S = scanner.nextLong();  // 讀取起始人數 S
            long D = scanner.nextLong();  // 讀取目標天數 D

            long total = S;  // 初始的總人數，從S開始
            long days = S;   // 計算目前已經經過的天數，從S開始

            // 繼續增加每天的參與者，直到總天數達到或超過目標天數 D
            while (total < D) {
                days++;      // 增加一天，表示多一個參與者
                total += days; // 更新總人數，將新參與者加入總人數
            }

            // 輸出達到或超過目標天數 D 所需的最少參與者數
            System.out.println(days);
        }

        scanner.close(); // 關閉輸入流
    }
}
