import java.util.Scanner;
public class t11461{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	while(a!=0 && b!=0){
		int count=0;
		for(int i=a;i<=b;i++){
			if(Math.sqrt(i)%1==0){
				count++;
			}
			
		}
        System.out.print(count);
        System.out.println();
		a = sc.nextInt();
		b = sc.nextInt();	
	}
    }
}