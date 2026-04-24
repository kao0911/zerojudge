import java.util.Arrays;
import java.util.Scanner;

class t10041 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt(); // 總共有多少個測試案例。
        
        while ((--cases) >= 0) {
            int size = sc.nextInt(); // 每個測試案例有多少筆資料。
            
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt(); // 讀取測試案例中的每個數據。
            }
            
            Arrays.sort(arr); // 先將資料排序。
            
            // 找出和中位數的差，並加總。
            int len = 0;
            for (int i = 0; i < size; i++) {
                len += Math.abs(arr[i] - arr[size / 2]); // 使用 size / 2 找到中位數。
            }
            // 輸出結果。
            System.out.println(len);
        }
        
        sc.close(); // 關閉 Scanner 對象。
    } 
}
