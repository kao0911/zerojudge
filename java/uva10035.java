import java.util.Scanner;

public class uva10035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long num1 = sc.nextLong();
            long num2 = sc.nextLong();
            
            // 終止條件
            if (num1 == 0 && num2 == 0) {
                break;
            }
            
            // 計算進位次數
            int carryCount = countCarryOperations(num1, num2);
            
            // 輸出結果
            if (carryCount == 0) {
                System.out.println("No carry operation.");
            } else if (carryCount == 1) {
                System.out.println("1 carry operation.");
            } else {
                System.out.println(carryCount + " carry operations.");
            }
        }
        
        sc.close();
    }
    
    public static int countCarryOperations(long num1, long num2) {
        int carry = 0; // 當前的進位
        int carryCount = 0; // 進位的次數

        while (num1 > 0 || num2 > 0) {
            int digit1 = (int)(num1 % 10);
            int digit2 = (int)(num2 % 10);
            
            // 計算當前位數字相加的結果及進位
            if (digit1 + digit2 + carry >= 10) {
                carry = 1;
                carryCount++;
            } else {
                carry = 0;
            }
            
            // 移動到下一位
            num1 /= 10;
            num2 /= 10;
        }
        
        return carryCount;
    }
}
