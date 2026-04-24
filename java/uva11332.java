/*
import java.util.Scanner;
public class uva11332{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.print(word.charAt(0));

    }
}
*/
import java.util.Scanner;

public class uva11332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String input = sc.nextLine();
            if (input.equals("0")) {
                break; // 當輸入為 0 時結束程式
            }
            
            int sum;
            do {
                sum = 0;
                // 計算各位數字之和
                for (int i = 0; i < input.length(); i++) {
                    sum += Character.getNumericValue(input.charAt(i));
                }
                input = String.valueOf(sum); // 將和轉換為字串以便進行下一次計算
            } while (sum >= 10); // 如果和是多位數，則繼續計算
            
            System.out.println(sum); // 輸出最終的單位數
        }
        
        sc.close(); // 關閉 Scanner
    }
}