# 計算一個數字的各位數字之和
def 計算數字和(n):
    return sum(int(digit) for digit in str(n))

# 判斷一個數字是否為9的倍數，並計算其9度數
def 是否為9的倍數(n):
    度數 = 0
    while n > 9:
        n = 計算數字和(n)
        度數 += 1
    return n == 9, 度數 + 1 if n == 9 else 0

# 主函數
def main():
    while True:
        # 讀取輸入
        n = input().strip()
        # 如果輸入為'0'，結束程序
        if n == '0':
            break
        
        # 將輸入轉換為整數
        原始數字 = int(n)
        # 判斷是否為9的倍數並獲取9度數
        是倍數, 度數 = 是否為9的倍數(原始數字)
        
        # 輸出結果
        if 是倍數:
            print(f"{原始數字} is a multiple of 9 and has 9-degree {度數}.")
        else:
            print(f"{原始數字} is not a multiple of 9.")

# 程序入口點
if __name__ == "__main__":
    main()
    # 很抱歉，我無法在Python文件中直接插入Java代碼。
    # Java和Python是兩種不同的編程語言，它們的語法和結構有很大的區別。
    # 如果您想要使用Java來解決這個問題，我建議您創建一個新的Java文件。
    # 以下是一個簡單的Java代碼結構示例，您可以在新的Java文件中使用：

    """
    import java.util.Scanner;

    public class UVA10922 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String n = scanner.nextLine().trim();
                if (n.equals("0")) {
                    break;
                }
                
                int degree = 0;
                int sum = sumOfDigits(n);
                while (sum > 9) {
                    degree++;
                    sum = sumOfDigits(Integer.toString(sum));
                }
                
                if (sum == 9) {
                    System.out.println(n + " is a multiple of 9 and has 9-degree " + (degree + 1) + ".");
                } else {
                    System.out.println(n + " is not a multiple of 9.");
                }
            }
            scanner.close();
        }
        
        private static int sumOfDigits(String n) {
            int sum = 0;
            for (char digit : n.toCharArray()) {
                sum += Character.getNumericValue(digit);
            }
            return sum;
        }
    }
    """
    # 請注意，這只是一個示例，您需要在一個新的Java文件中實現完整的解決方案。
    # 以下是一個簡單的C語言版本的UVA10922問題解決方案：

    """
    #include <stdio.h>
    #include <string.h>

    int sumOfDigits(char* n) {
        int sum = 0;
        for (int i = 0; n[i] != '\0'; i++) {
            sum += n[i] - '0';
        }
        return sum;
    }

    int main() {
        char n[1001];
        while (1) {
            scanf("%s", n);
            if (strcmp(n, "0") == 0) {
                break;
            }
            
            int degree = 0;
            int sum = sumOfDigits(n);
            while (sum > 9) {
                degree++;
                char temp[10];
                sprintf(temp, "%d", sum);
                sum = sumOfDigits(temp);
            }
            
            if (sum == 9) {
                printf("%s is a multiple of 9 and has 9-degree %d.\n", n, degree + 1);
            } else {
                printf("%s is not a multiple of 9.\n", n);
            }
        }
        return 0;
    }
    """

    # 注意：這是C語言代碼，需要在C編譯器中運行。
    # 在Python文件中，我們只能將其作為註釋或多行字符串保存。
