import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int temperature = 0;
		System.out.print("请输入需要转换的华氏温度：");
		temperature = in.nextInt();
		System.out.println((int)((temperature-32)/1.8));
		in.close();
	}

}
