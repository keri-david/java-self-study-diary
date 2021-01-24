import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个非负整数：");
		int number=in.nextInt(),yushu,tmp=1,count=1,result=0;
		while(number!=0) {
			yushu=number%10;
			number/=10;
			if(yushu%2!=0&&count%2!=0||yushu%2==0&count%2==0)
				result+=tmp;
			tmp*=2;
			count++;
		}
		System.out.print(result);
		in.close();
	}

}
