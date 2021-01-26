import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入两个整数：");
		int n=0,m=0,count=0,sum=0;
		n=in.nextInt();
		m=in.nextInt();
		for(int i=2;i<200;i++) {
			int isPrime=1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=0;
					break;
				}
			}
			if(isPrime==1) {
				count++;
				if(count>=n&&count<=m)
						sum+=i;
			}
		}
		System.out.print(sum);
		in.close();
	}

}
