/*
import java.util.Scanner;
public class uva100{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        int cycle = countcycle(num1 , num2);
        int count = 0;
        System.out.print(cycle);
        System.out.print(count);
    }
    public static int countcycle(long num1 ,long num2){
        long num;
        long i ;
        for(i = num1;i <= num2;i++){
            while(num!=1){
                if(num1%2==0){
                    num=3*num1+1;
                    count++;
                }else{
                    num=num1/2;
                    count++;
                }
            }
        }
    }
}
*/
/*
import java.util.Scanner;

public class uva100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        int maxCycle = 0;
        for (long i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            int cycle = countCycle(i);
            if (cycle > maxCycle) {
                maxCycle = cycle;
            }
        }
        System.out.println(maxCycle);
    }

    public static int countCycle(long n) {
        int count = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }
        return count;
    }
}
*/
//Java
import java.util.Scanner;

class uva100{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int a=sc.nextInt(),b=sc.nextInt();
			int min=Math.min(a,b);
			int max=Math.max(a,b);
			
			int c=0; //3n+1 所需要迴圈次數的最大值
			for(int i=min;i<=max;i++){
				int temp=1; //3n+1 所需要迴圈次數
				for(int j=i;j!=1;){
					if(j%2==0)j=j/2;
					else j=j*3+1;
					temp++;
				}
				
				if(temp>c)c=temp; //判別此數的迴圈次數是否為最大值
			}
			//Output
			System.out.println(a+" "+b+" "+c);
		}
	}
}