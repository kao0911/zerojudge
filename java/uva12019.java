/*
import java.util.Scanner;

public class uva12019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of doomsdays for each month in 2011 (1-based indexing)
        int[] doomsday = {0, 10, 21, 7, 4, 9, 6, 11, 8, 5, 10, 7, 12};

        // Days of the week where 0=Monday, 1=Tuesday, ..., 6=Sunday
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int month = sc.nextInt();
            int day = sc.nextInt();

            int diff = day - doomsday[month];
            int dayOfWeek = (diff % 7 + 7) % 7; // To handle negative differences

            System.out.println(week[dayOfWeek]);
        }

        sc.close();
    }
}
*/
//Java
import java.util.Scanner;

class uva12019{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++){
			int month[]={31,28,31,30,31,30,31,31,30,31,30,31}; //每個月天數。
			String week[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; //星期表。
			int M=sc.nextInt();
			int D=sc.nextInt();
			
			D=D+4; //調整成0=Monday 1=Tuesday ...。
			for(int j=1;j<M;j++){
                //D=D+4;
				D=D+month[j-1];
			}
			
			//Output
			System.out.println(week[D%7]);
		}
	}
}