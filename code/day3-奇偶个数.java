import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一系列正整数：（以数字-1结束）");
		int number=0,jishu=0,oushu=0;
		number=in.nextInt();
		while (number!=-1) {
			if(number>100000||number<0)
				System.out.print("不在范围内！");
			if(number%2==0)
				oushu+=1;
			else
				jishu+=1;
			number=in.nextInt();
		}
		System.out.print(jishu+" "+oushu);
		in.close();
	}

}
