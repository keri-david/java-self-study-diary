import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bjt = 0,utc =0;
		System.out.print("请输入需要转换的北京时间：");
		bjt = in.nextInt();
		if(bjt>=0&&bjt<=2359)
		{
			if(bjt/800>0)
			{
				//utc=(bjt/100-8)*100+bjt%100;//我就是个傻逼，搞这么复杂
				utc=bjt-800;
			}
			else
			{
				utc=bjt+2400-800;//这边吸取了前面经验，没搞那么复杂
			}
			System.out.println(utc);
		}
		else
			System.out.print("输入时间超出大小！");
		in.close();
	}

}
