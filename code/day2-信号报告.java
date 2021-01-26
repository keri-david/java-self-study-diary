import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rs=0,r=0,s=0;
		StringBuffer report=new StringBuffer("");
		System.out.print("输入整数:");
		rs=in.nextInt();
		r=rs/10;
		s=rs%10;
		//System.out.print(r+" "+s);
		switch(s) {
		case 1:report.append("Faint signals, barely perceptible,");
		break;
		case 2:report.append("Very weak signals,");
		break;
		case 3:report.append("Weak signals,");
		break;
		case 4:report.append("Fair signals,");
		break;
		case 5:report.append("Fairly good signals,");
		break;
		case 6:report.append("Good signals,");
		break;
		case 7:report.append("Moderately strong signals,");
		break;
		case 8:report.append("Strong signals,");
		break;
		case 9:report.append("Extremely strong signals,");
		break;
		}
		switch(r) {
		case 1:report.append("unreadable.");
		break;
		case 2:report.append("barely readable, occasional words distinguishable.");
		break;
		case 3:report.append("readable with considerable difficulty.");
		break;
		case 4:report.append("readable with practically no difficulty.");
		break;
		case 5:report.append("perfectly readable.");
		break;
		}
		System.out.print(report);
		in.close();
	}

}
