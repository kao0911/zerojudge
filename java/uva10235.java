/*
import java.util.Scanner;
public class uva10235{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int num = sc.nextInt();
            if (isPrime(num)) {
            System.out.println(num + " 是質數。");
            } else {
                System.out.println(num + " 不是質數。");
            }
            
        }
        
    }
    // 判斷質數的函數
    public static boolean isPrime(int num) {
        // 如果數字小於等於1，則不是質數
        if (num <= 1) {
            return false;
        }
        // 從2到根號num進行檢查
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
*/
import java.util.Scanner;

public class uva10235 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 當還有數字輸入時
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();  // 讀取輸入的數字
            
            // 檢查 n 是否為質數
            if (!isPrime(n)) {
                System.out.println(n + " is not prime.");  // 如果不是質數，直接輸出
            } else {
                // 如果是質數，反轉數字並檢查反轉後的數字是否也是質數
                int reversed = reverseNumber(n);  // 反轉 n
                if (n != reversed && isPrime(reversed)) {
                    System.out.println(n + " is emirp.");  // 如果反轉後的數字也是質數且不同，則是 emirp
                } else {
                    System.out.println(n + " is prime.");  // 如果反轉後不是質數，則只是單純的質數
                }
            }
        }
        scanner.close();  // 關閉 Scanner
    }

    // 判斷質數的函數
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 小於等於 1 的數不是質數
        // 檢查從 2 到 √num 是否有因數
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // 如果有因數，則不是質數
            }
        }
        return true;  // 沒有發現任何因數，則是質數
    }

    // 反轉數字的函數
    public static int reverseNumber(int num) {
        int reversed = 0;
        // 將數字每次取出最右邊的一位，並組成新的數字
        while (num > 0) {
            reversed = reversed * 10 + (num % 10);  // 將最右邊的一位數加到 reversed
            num /= 10;  // 將原數字右移一位
        }
        return reversed;  // 返回反轉後的數字
    }
}
