/*import java.util.Scanner;

public class uva10071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 當還有輸入時，持續執行
        while (scanner.hasNext()) {
            int v = scanner.nextInt(); // 讀取初始速度
            int t = scanner.nextInt(); // 讀取時間

            // 計算位移：s = v * t * 2
            // 因為加速度恆定，所以 2t 時間的位移是 v * t 的兩倍
            int s = v * t * 2;

            // 輸出結果
            System.out.println(s);
        }

        scanner.close(); // 關閉 Scanner
    }
}*/
import java.util.Scanner;
public class uva10071{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int v = sc.nextInt();
            int t = sc.nextInt();
            int s= v*t*2;
            System.out.println(s);
        }
        sc.close();
    }
}
