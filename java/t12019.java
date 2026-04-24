import java.util.Scanner;
public  class t12019{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
            String week[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            int m = sc.nextInt();
            int d = sc.nextInt();  
            d=d+4; //調整成0=Monday 1=Tuesday ...。
			for(int j=1;j<m;j++){
                //D=D+4;
				d=d+month[j];
			}
			
			//Output
			System.out.println(week[d%7]);  
        }
        

    }
}