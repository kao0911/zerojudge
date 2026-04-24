import java.util.Scanner;

class uva11349 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int cases = Integer.parseInt(sc.next());
        for (int i = 0; i < cases; i++) {
            String temp1 = sc.next(), temp2 = sc.next();

            int n = Integer.parseInt(sc.next());
            long arr[] = new long[n * n];

            int size = n * n;
            for (int j = 0; j < size; j++) 
                arr[j] = Long.parseLong(sc.next()); // Added missing semicolon here

            boolean flag = true;
            for (int j = 0; j < size; j++) {
                if (arr[j] < 0 || (arr[j] != arr[size - 1 - j])) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                System.out.println("Test #" + (i + 1) + ": Symmetric.");
            else
                System.out.println("Test #" + (i + 1) + ": Non-symmetric.");
        }
    }
}
