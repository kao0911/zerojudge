import java.util.HashSet;
import java.util.Scanner;

public class uva10038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 讀取輸入的序列長度
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] sequence = new int[n];
            
            // 讀取序列中的數字
            for (int i = 0; i < n; i++) {
                sequence[i] = scanner.nextInt();
            }

            // 檢查是否為Jolly Jumper序列
            if (isJollyJumper(sequence)) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }
        }
    }

    // 檢查是否為Jolly Jumper序列的函數
    private static boolean isJollyJumper(int[] sequence) {
        int n = sequence.length;

        // 如果序列長度為1，則一定是Jolly Jumper
        if (n == 1) return true;

        // 使用集合來存儲所有出現的差值
        //Set<Integer> diffs = new HashSet<>();
        HashSet<Integer> diffs = new HashSet<>();

        // 計算相鄰元素的差的絕對值
        for (int i = 1; i < n; i++) {
            int diff = Math.abs(sequence[i] - sequence[i - 1]);

            // 如果差值不在1到n-1之間，則不是Jolly Jumper
            if (diff < 1 || diff >= n) return false;

            // 將差值添加到集合中
            diffs.add(diff);
        }

        // 如果集合中的元素數量等於n-1，則是Jolly Jumper
        return diffs.size() == n - 1;
    }
}
