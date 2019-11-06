package dome1;

public class demo {
	public static void main(String[] args) {
		String str = "123abcDEF";
		fangshen(str);
		System.out.println(zhuanhuan("abcdDca"));
	}
	public static void fangshen(String str) {
		int a = 0;
		int b = 0;
		int c = 0;
		char ch;
		for (int i = 0; i< str.length() ;i++)
		{
			ch = str.charAt(i);
			if (ch>='a' && ch<='z') {
				b++;
			}else if(ch>='A' && ch<='z') {
				a++;
			}else if(ch>='0' && ch<='9') {
				c++;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static String zhuanhuan(String str) {
		String a = str.substring(0,1);
		String b = str.substring(1);
		a = a.toUpperCase();
		b = b.toLowerCase();
		return a+b;
	}

}
