#include <stdio.h>
#include <string.h>

#define MAX_BASES 36
#define MAX_NUMBERS 1000

int costs[MAX_BASES];
int cheapest_bases[MAX_BASES];

int calculate_cost(int number, int base) {
    int total_cost = 0;
    do {
        total_cost += costs[number % base];
        number /= base;
    } while (number > 0);
    return total_cost;
}

void find_cheapest_bases(int number) {
    int min_cost = 1e9;
    int cheapest_count = 0;

    for (int base = 2; base <= MAX_BASES; base++) {
        int cost = calculate_cost(number, base);
        if (cost < min_cost) {
            min_cost = cost;
            cheapest_count = 0;
            cheapest_bases[cheapest_count++] = base;
        } else if (cost == min_cost) {
            cheapest_bases[cheapest_count++] = base;
        }
    }

    printf("Cheapest base(s) for number %d:", number);
    for (int i = 0; i < cheapest_count; i++) {
        printf(" %d", cheapest_bases[i]);
    }
    printf("\n");
}

int main() {
    int test_cases, numbers_count, number;

    scanf("%d", &test_cases);

    for (int case_num = 1; case_num <= test_cases; case_num++) {
        for (int i = 0; i < MAX_BASES; i++) {
            scanf("%d", &costs[i]);
        }

        scanf("%d", &numbers_count);

        if (case_num > 1) printf("\n");
        printf("Case %d:\n", case_num);

        for (int i = 0; i < numbers_count; i++) {
            scanf("%d", &number);
            find_cheapest_bases(number);
        }
    }

    return 0;
}
