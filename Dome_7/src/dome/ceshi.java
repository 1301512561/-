package dome;

public class ceshi {

	public static void main(String[] args) {
		person p1 = new person("二狗", 13);
		person p2 = new person("铁蛋", 13);
		
		boolean b = p1.equals(p2);
       System.out.println(b);
       person p3 = new person( "锤子", 5);
       String s = p3.toString();
       System.out.println(p3);
       System.out.println(s);
       String str1 = new String("abc");
       String str2 = "abc";
       //比较str1和str2的地址是否相同
       System.out.println(str1 == str2);
      // String 重写了equals 方法，是比较字符串是否相等
		boolean bo = str1.equals(str2); 
		System.out.println(bo);
		funshen();
		
	}
	public static void funshen() {
		byte [] b = {97,98,99};
		String s = new String(b); //如果输入的是负数将打印汉字，
		                          //一个汉字两个字节 即-60，-61 标识一个汉字
		System.out.println(s);
		String s1 = new String(b,1,2);
		// 1 表示从1索引开始   2表示 编码两个数 输出结果是bc
		System.out.println(s1);
	}

}
