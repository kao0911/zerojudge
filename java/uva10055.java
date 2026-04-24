import java.util.Scanner;

public class uva10055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLong()) {
            // 讀取兩個軍隊的數量
            long armyHashmat = scanner.nextLong();
            long armyOpponent = scanner.nextLong();
            
            // 計算並輸出差的絕對值
            System.out.println(Math.abs(armyHashmat - armyOpponent));
        }
        
        // 關閉Scanner以釋放資源
        scanner.close();
    }
}