#include <iostream>
#include <cstdlib> // 用於 abs() 函數

using namespace std;

int main() {
    long long armyHashmat, armyOpponent;
    
    // 當還有輸入時，持續執行
    while (cin >> armyHashmat >> armyOpponent) {
        // 計算並輸出兩軍隊數量的絕對差
        cout << abs(armyHashmat - armyOpponent) << endl;
    }
    
    return 0;
}
