while True:
    try:
        # 讀取輸入
        army_hashmat, army_opponent = map(int, input().split())
        # 計算並輸出差的絕對值
        print(abs(army_hashmat - army_opponent))
    except EOFError:
        # 當遇到EOF時退出迴圈
        break

# UVA 10783 Java 解法
"""
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int caseNum = 1; caseNum <= T; caseNum++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = 0;
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println("Case " + caseNum + ": " + sum);
        }
        scanner.close();
    }
}
// UVA 10783 C++ 解法

#include <iostream>
using namespace std;

int main() {
    int T;
    cin >> T;
    for (int caseNum = 1; caseNum <= T; caseNum++) {
        int a, b;
        cin >> a >> b;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        cout << "Case " << caseNum << ": " << sum << endl;
    }
    return 0;
}

"""

# UVA 10812 - Beat the Spread!

# C++ 解法
"""
#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;  // 讀取測試案例數量
    while (n--) {
        long long s, d;
        cin >> s >> d;  // 讀取總和和差值
        if (s < d || (s + d) % 2 != 0) {
            cout << "impossible" << endl;  // 如果總和小於差值或總和加差值為奇數，則無解
        } else {
            long long a = (s + d) / 2;  // 計算較大的數
            long long b = s - a;  // 計算較小的數
            cout << a << " " << b << endl;  // 輸出結果
        }
    }
    return 0;
}
"""

# Java 解法
"""
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 讀取測試案例數量
        while (n-- > 0) {
            long s = scanner.nextLong();  // 讀取總和
            long d = scanner.nextLong();  // 讀取差值
            if (s < d || (s + d) % 2 != 0) {
                System.out.println("impossible");  // 如果總和小於差值或總和加差值為奇數，則無解
            } else {
                long a = (s + d) / 2;  // 計算較大的數
                long b = s - a;  // 計算較小的數
                System.out.println(a + " " + b);  // 輸出結果
            }
        }
        scanner.close();
    }
}
"""

# Python 解法
n = int(input())  # 讀取測試案例數量
for _ in range(n):
    s, d = map(int, input().split())  # 讀取總和和差值
    if s < d or (s + d) % 2 != 0:
        print("impossible")  # 如果總和小於差值或總和加差值為奇數，則無解
    else:
        a = (s + d) // 2  # 計算較大的數
        b = s - a  # 計算較小的數
        print(f"{a} {b}")  # 輸出結果

