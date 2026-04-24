import java.util.Scanner;

class uva10008{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		//處理有多少case
		String temp=sc.nextLine();
		int N=0;
		for(int i=0;i<temp.length();i++){
			if(temp.charAt(i)>=48 && temp.charAt(i)<=56) N=N*10+temp.charAt(i)-48;
		}
		
		//初始化陣列
		int f[]=new int[26];
		for(int i=0;i<26;i++){
			f[i]=0;
		}
		
		//開始記錄字母出現的頻率
		for(int i=0;i<N;i++){
			String st=sc.nextLine();
			
			for(int j=0;j<st.length();j++){
				if(st.charAt(j)>=65 && st.charAt(j)<=90) f[st.charAt(j)-65]++;
				else if(st.charAt(j)>=97 && st.charAt(j)<=122) f[st.charAt(j)-97]++;
				
			}
		}
		
		//找出最大值
		int max=0;
		for(int i=0;i<26;i++){
			if(f[i]>max) max=f[i];
		}
		
		//印出資料
		for(int i=max;i>0;i--){
			for(int j=0;j<26;j++){
				if(f[j]==i) System.out.println((char)(j+65)+" "+i);
			}
		}
	}
}