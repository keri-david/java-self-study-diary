import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int number=in.nextInt(),o_number=0,count=0;
		if(number<0) {
			number=-number;
			System.out.print("fu ");
		}
		o_number=number;
		do {
			number/=10;
			count++;
		}while(number>0);
		while(count>0) {
			int chushu=(int)Math.pow(10, count-1);
			int flag=o_number/chushu;
			o_number%=chushu;
			switch(flag)
			{
			case 0:System.out.print("ling ");break;
			case 1:System.out.print("yi ");break;
			case 2:System.out.print("er ");break;
			case 3:System.out.print("san ");break;
			case 4:System.out.print("si ");break;
			case 5:System.out.print("wu ");break;
			case 6:System.out.print("liu ");break;
			case 7:System.out.print("qi");break;
			case 8:System.out.print("ba");break;
			case 9:System.out.print("jiu");break;
			default:break;
			}
			count --;
		}
		in.close();
	}
}
