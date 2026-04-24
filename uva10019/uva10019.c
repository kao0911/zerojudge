#include <stdlib.h>
#include <stdio.h>

int count_bits(int n) {
    int count = 0;
    while (n) {
        count += n & 1;
        n >>= 1;
    }
    return count;
}

int hex_to_dec(int hex) {
    int dec = 0, base = 1;
    while (hex) {
        dec += (hex % 10) * base;
        hex /= 10;
        base *= 16;
    }
    return dec;
}

int main() {
    int cases, num;
    scanf("%d", &cases);
    
    while (cases--) {
        scanf("%d", &num);
        
        int dec_bits = count_bits(num);
        int hex_bits = count_bits(hex_to_dec(num));
        
        printf("%d %d\n", dec_bits, hex_bits);
    }
    
    return 0;
}
