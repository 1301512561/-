package dome;

public class ceshi {

	public static void main(String[] args) {
		person p1 = new person("����", 13);
		person p2 = new person("����", 13);
		
		boolean b = p1.equals(p2);
       System.out.println(b);
       person p3 = new person( "����", 5);
       String s = p3.toString();
       System.out.println(p3);
       System.out.println(s);
       String str1 = new String("abc");
       String str2 = "abc";
       //�Ƚ�str1��str2�ĵ�ַ�Ƿ���ͬ
       System.out.println(str1 == str2);
      // String ��д��equals �������ǱȽ��ַ����Ƿ����
		boolean bo = str1.equals(str2); 
		System.out.println(bo);
		funshen();
		
	}
	public static void funshen() {
		byte [] b = {97,98,99};
		String s = new String(b); //���������Ǹ�������ӡ���֣�
		                          //һ�����������ֽ� ��-60��-61 ��ʶһ������
		System.out.println(s);
		String s1 = new String(b,1,2);
		// 1 ��ʾ��1������ʼ   2��ʾ ���������� ��������bc
		System.out.println(s1);
	}

}
