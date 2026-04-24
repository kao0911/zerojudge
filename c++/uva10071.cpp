#include <iostream>
using namespace std;

int main() {
    int v, t;
    while (cin >> v >> t) {
        // 計算位移：s = v * t * 2
        // 因為加速度恆定，所以 2t 時間的位移是 v * t 的兩倍
        int s = v * t * 2;
        
        // 輸出結果
        cout << s << endl;
    }
    
    return 0;
}
