/*import java.util.Scanner;
public class a005{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k =sc.nextInt();
        int[] nums = new int[5];
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < nums.length; j++){
                nums[i] = sc.nextInt();
            }
        }
    }
}*/

import java.util.Scanner;

public class a005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 數列數目

        for (int i = 0; i < t; i++) {
            int[] a = new int[5];
            for (int j = 0; j < 4; j++) {
                a[j] = sc.nextInt();
            }

            // 判斷等差或等比
            if (a[1] - a[0] == a[2] - a[1]) {
                int d = a[1] - a[0];
                a[4] = a[3] + d;
            } else {
                int r = a[1] / a[0];
                a[4] = a[3] * r;
            }

            // 輸出
            for (int j = 0; j < 5; j++) {
                System.out.print(a[j]);
                if (j < 4) System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
import java.util.Scanner;

public class a005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; ++i) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                int D = sc.nextInt();

                if (B - A == D - C) {
                    int X = B - A;
                    String a = "%d %d %d %d %d \n";
                    System.out.printf(a, A, B, C, D, D + X);
                } else if (B / A == D / C) {
                    int Y = D / C;
                    String a = "%d %d %d %d %d \n";
                    System.out.printf(a, A, B, C, D, D * Y);
                }
            }
        }
    }
}
*/
