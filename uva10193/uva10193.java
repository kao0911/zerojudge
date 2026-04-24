import java.math.BigInteger;
import java.util.Scanner;

public class uva10193 {

    // 將二進制字串轉換為十進制，並計算 GCD
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 讀取測試案例數量
        scanner.nextLine();  // 讀取換行符號
        
        for (int i = 1; i <= n; i++) {
            String binary1 = scanner.nextLine().trim();  // 讀取第一個二進制數字並移除空白
            String binary2 = scanner.nextLine().trim();  // 讀取第二個二進制數字並移除空白
            
            // 將二進制數字轉換為 BigInteger 來處理大數問題
            BigInteger decimal1 = new BigInteger(binary1, 2);
            BigInteger decimal2 = new BigInteger(binary2, 2);
            
            // 計算 GCD
            BigInteger gcd = decimal1.gcd(decimal2);
            
            // 如果 GCD 大於 1，則表示有共同點
            if (gcd.compareTo(BigInteger.ONE) > 0) {
/*逐步解釋：
gcd.compareTo(BigInteger.ONE)：

compareTo() 是 BigInteger 類別中的一個方法，專門用來比較兩個 BigInteger 數字。
BigInteger.ONE 是 BigInteger 類別中的常數，代表數值 1。
當 gcd.compareTo(BigInteger.ONE) 被呼叫時，會比較 gcd 和 BigInteger.ONE 的大小：
如果 gcd 大於 1，則 compareTo() 返回正數。
如果 gcd 等於 1，則返回 0。
如果 gcd 小於 1，則返回負數。
if (gcd.compareTo(BigInteger.ONE) > 0)：

這條 if 語句的條件是當 gcd 大於 1 時成立，因為 compareTo() 返回值大於 0。
如果 gcd 是 1 或更小，這個條件就不會成立。
*/
                System.out.println("Pair #" + i + ": All you need is love!");
            } else {
                System.out.println("Pair #" + i + ": Love is not all you need!");
            }
        }
        scanner.close();  // 關閉 Scanner
    }
}
