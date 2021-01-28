import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入两个多项式：");
		int [] a = new int[101];
		int [] b = new int[101];
		int mi=in.nextInt();
		int xishu=in.nextInt();
		while(mi>=0) {
			a[mi]=xishu;
			mi=in.nextInt();
			xishu=in.nextInt();
			if(mi==0) {
				a[0]=xishu;
				mi=in.nextInt();
				xishu=in.nextInt();
				break;
			}
		}
		while(mi>=0) {
			b[mi]=xishu;
			mi=in.nextInt();
			xishu=in.nextInt();
			if(mi==0) {
				b[0]=xishu;
				break;
			}
		}
		for(int i=a.length-1;i>0;i--) {
			if(a[i]!=0||b[i]!=0) {
				System.out.print((a[i]+b[i])+"*"+i+"+");
			}
		}
		if(a[0]!=0||b[0]!=0) {
			System.out.print((a[0]+b[0]));
		}
		in.close();
	}
}
