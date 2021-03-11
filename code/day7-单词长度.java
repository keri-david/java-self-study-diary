public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一行文本:");
		String s = in.next();;
		while (!(s.equals("."))) {
			if (s.indexOf('.')<0) {
				System.out.print(s.length()+" ");
			}
			else {
				System.out.print(s.length()-1);
				s=".";
			}
			s = in.next();
		}
		in.close();
	}
}
