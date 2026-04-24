/*
import java.util.Scanner;

public class uva11417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int G = 0;
            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    G += gcd(i, j);
                }
            }
            System.out.println(G);
        }
        sc.close();
    }
    

    // 計算兩個數字的最大公因數
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int a, b, n;
    while (cin >> a >> b) {
        int count = 0;
        if (a == 0 && b == 0) {
            break;
        }
        for (int i = a; i <= b; i++) {
            n = sqrt(i);
            if (n * n == i) {
                count++;
            }
        }
        cout << count << endl;
    }
    return 0;
}
import math

def count_perfect_squares(a, b):
    count = 0
    for i in range(a, b + 1):
        n = int(math.sqrt(i))
        if n * n == i:
            count += 1
    return count

def main():
    while True:
        a, b = map(int, input().split())
        if a == 0 and b == 0:
            break
        print(count_perfect_squares(a, b))

if __name__ == "__main__":
    main()

*/
void RadixSort(Element* list, const int d, const int n) {
    int e[radix], f[radix]; // queue pointers
    for (int i = 1; i <= n; i++) list[i].link = i + 1; // link into a chain starting at current
    list[n].link = 0; 
    int current = 1;

    for (int i = d - 1; i >= 0; i--) { // sort on key key[i]
        for (int j = 0; j < radix; j++) f[j] = 0; // initialize bins to empty queues
        for (; current; current = list[current].link) { // put records into queues
            int k = list[current].key[i];
            if (f[k] == 0) f[k] = current;
            else list[e[k]].link = current;
            e[k] = current;
        }

        for (int j = 0; f[j] == 0; j++); // find the first non-empty queue
        current = f[j]; 
        int last = e[j];
        for (int k = j + 1; k < radix; k++) { // concatenate remaining queues
            if (f[k]) {
                list[last].link = f[k];
                last = e[k];
            }
        }
        list[last].link = 0;
    }
}
