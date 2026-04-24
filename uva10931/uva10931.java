/*好的,我會一步一步帶你完成UVA10931這道題目的Java實現。讓我們從基本結構開始:

1. 首先,我們需要導入必要的Java類:

import java.util.Scanner;

2. 接下來,我們創建主類和main方法:

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 主要邏輯將在這裡實現
        
        scanner.close();
    }
}

3. 現在,我們需要實現一個循環來讀取輸入,直到遇到0:

while (true) {
    int I = scanner.nextInt();
    if (I == 0) break;
    
    // 處理每個輸入的邏輯將在這裡實現
}

4. 接下來,我們需要將整數轉換為二進制字符串。Java提供了一個內置方法來做這個:

String binary = Integer.toBinaryString(I);

5. 然後,我們需要計算二進制字符串中1的數量:

int parity = 0;
for (char c : binary.toCharArray()) {
    if (c == '1') parity++;
}

6. 最後,我們需要輸出結果:

System.out.println("The parity of " + binary + " is " + parity + " (mod 2).");

這就是基本的結構。你想要我們繼續完善哪一部分?

*/
import java.util.Scanner;
public class uva10931{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int I = scanner.nextInt();
            if (I == 0) break;
            else{
                String binary = Integer.toBinaryString(I);
                int parity = 0;
                for (char c : binary.toCharArray()) {
                    if (c == '1') parity++;
                }
                System.out.println("The parity of " + binary + " is " + parity + " (mod 2).");
            }
        }
        scanner.close();
    }
}
