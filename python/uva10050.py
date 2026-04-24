# UVA 10050 - Hartals (罷工問題)

# 導入必要的模組
import sys

# 定義主函數
def main():
    # 讀取測試案例數量
    T = int(sys.stdin.readline())
    
    # 對每個測試案例進行處理
    for _ in range(T):
        # 讀取模擬天數
        N = int(sys.stdin.readline())
        # 讀取政黨數量
        P = int(sys.stdin.readline())
        
        # 創建一個列表來記錄每天是否為罷工日
        hartal_days = [False] * (N + 1)
        
        # 處理每個政黨的罷工週期
        for _ in range(P):
            h = int(sys.stdin.readline())
            # 標記罷工日
            for day in range(h, N + 1, h):
                if day % 7 not in [6, 0]:  # 排除週五和週六
                    hartal_days[day] = True
        
        # 計算罷工日總數
        total_hartals = sum(hartal_days)
        
        # 輸出結果
        print(total_hartals)

# 如果這個腳本是主程序，則執行 main() 函數
if __name__ == "__main__":
    main()

    # 很抱歉，我無法在Python文件中插入Java代碼。
    # Java和Python是兩種不同的編程語言，它們的語法和結構有很大的區別。
    # 如果您想要使用Java來解決這個問題，我建議您創建一個新的Java文件。
    # 在Java文件中，您可以使用類似的邏輯來實現這個罷工問題的解決方案。
    # 以下是一個簡單的Java代碼結構示例，您可以在新的Java文件中使用：
    
    """
    import java.util.Scanner;

    public class UVA10050 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            
            for (int t = 0; t < T; t++) {
                int N = scanner.nextInt();
                int P = scanner.nextInt();
                
                boolean[] hartalDays = new boolean[N + 1];
                
                for (int p = 0; p < P; p++) {
                    int h = scanner.nextInt();
                    for (int day = h; day <= N; day += h) {
                        if (day % 7 != 6 && day % 7 != 0) {
                            hartalDays[day] = true;
                        }
                    }
                }
                
                int totalHartals = 0;
                for (boolean isHartal : hartalDays) {
                    if (isHartal) totalHartals++;
                }
                
                System.out.println(totalHartals);
            }
            
            scanner.close();
        }
    }
    """
    # 請注意，這只是一個示例，您需要在一個新的Java文件中實現完整的解決方案。

# 以下是一個簡單的C語言版本的UVA10050問題解決方案：

"""
#include <stdio.h>
#include <string.h>

#define MAX_DAYS 3651
#define MAX_PARTIES 100

int main() {
    int T, N, P, h;
    int i, j, case_num;
    int hartals[MAX_PARTIES];
    int is_hartal[MAX_DAYS];
    
    scanf("%d", &T);
    
    for(case_num = 0; case_num < T; case_num++) {
        memset(is_hartal, 0, sizeof(is_hartal));
        
        scanf("%d", &N);
        scanf("%d", &P);
        
        for(i = 0; i < P; i++) {
            scanf("%d", &hartals[i]);
        }
        
        for(i = 0; i < P; i++) {
            for(j = hartals[i]; j <= N; j += hartals[i]) {
                if(j % 7 != 0 && j % 7 != 6) {
                    is_hartal[j] = 1;
                }
            }
        }
        
        int total_hartals = 0;
        for(i = 1; i <= N; i++) {
            if(is_hartal[i]) {
                total_hartals++;
            }
        }
        
        printf("%d\n", total_hartals);
    }
    
    return 0;
}
"""

# 注意：這是C語言代碼，需要在C編譯器中運行。
# 在Python文件中，我們只能將其作為註釋或多行字符串保存。
