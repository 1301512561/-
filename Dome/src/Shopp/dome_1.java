package Shopp;

import java.util.ArrayList;
import java.util.Scanner;

public class dome_1 {

	public static void main(String[] args) {

		ArrayList<chaoshi> arr = new ArrayList<chaoshi>();
		init(arr);
		while (true) {
			biaotou();
			baili(arr);
			gongneng();
			System.out.println("����Ҫѡ��Ĺ������");
			Scanner sc = new Scanner(System.in);
			int i;
			i = sc.nextInt();
			switch (i) {
			case 1:
				baili(arr);
				break;
			case 2:
				zengjia(arr);
				break;
			case 3:
				xiugai(arr);
				break;
			case 4:
				shanchu(arr);
				break;
			case 5:
				return;
				
			default:
				System.out.println("����Ĺ�����Ų���ȷ������������");
				break;
			}

		}

	}

	// ������Ʒ��ʼ��
	public static void init() {

	}

	static void init(ArrayList<chaoshi> arr) {

		chaoshi chao = new chaoshi();
		chao.a = 10;
		chao.i = "����";
		chao.ID = 10001;
		chao.p = 3;
		arr.add(chao);

		chaoshi chao1 = new chaoshi();
		chao1.a = 20;
		chao1.i = "��Ƭ";
		chao1.ID = 10002;
		chao1.p = 3.5;
		arr.add(chao1);

		chaoshi chao2 = new chaoshi();
		chao2.a = 30;
		chao2.i = "��̦";
		chao2.ID = 10003;
		chao2.p = 6.7;
		arr.add(chao2);

	}

	// ��Ʒ����
	public static void baili(ArrayList<chaoshi> arr) {
		int i = 0;
		for (i = 0; i < arr.size(); i++) {
			chaoshi shi = new chaoshi();
			shi = arr.get(i);
			System.out.println(shi.ID + "  " + shi.i + "           " + shi.p + "     " + shi.a);
		}
	}

	// �����Ʒ
	public static void zengjia(ArrayList<chaoshi> arr) {

		chaoshi shi1 = new chaoshi();
		Scanner sc = new Scanner(System.in);
		System.out.println("����������Ʒ�ı��");
		shi1.ID = sc.nextInt();
		System.out.println("����������Ʒ������");
		shi1.i = sc.next();
		System.out.println("����������Ʒ�ļ۸�");
		shi1.p = sc.nextDouble();
		System.out.println("����������Ʒ�Ŀ��");
		shi1.a = sc.nextInt();
		arr.add(shi1);
	}

	// �޸���Ʒ
	public static void xiugai(ArrayList<chaoshi> arr) {
		chaoshi shi2 = new chaoshi();
		System.out.println("������Ҫ�޸ĵ���Ʒ�ı��");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		for (int i = 0; i < arr.size(); i++) {
			shi2 = arr.get(i);
			if (shi2.ID == a) {
				System.out.println("���ҵ�Ҫ�޸ĵ���Ʒ");
				System.out.println("�������µ���Ʒ���");
				shi2.ID = sc.nextInt();
				System.out.println("�������µ���Ʒ������");
				shi2.i = sc.next();
				System.out.println("����������Ʒ�ļ۸�");
				shi2.p = sc.nextDouble();
				System.out.println("����������Ʒ�Ŀ��");
				shi2.a = sc.nextInt();
				return;
			}
			b = b + 1;
			if (b == arr.size() - 1) {
				System.out.println("Ҫ�޸ĵ���Ʒ������");
			}

		}
	}

	// ɾ����Ʒ
	public static void shanchu(ArrayList<chaoshi> arr) {
		chaoshi shi3 = new chaoshi();
		System.out.println("������Ҫɾ������Ʒ���");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int i;
		int c = 0;
		for (i = 0; i < arr.size(); i++) {
			shi3 = arr.get(i);
			if (shi3.ID == b) {
				System.out.println("�ҵ�Ҫɾ������Ʒ");
				arr.remove(i);
				System.out.println("��Ʒɾ���ɹ�");
				return;
			}
			c = c + 1;
			if (c == arr.size()) {
				System.out.println("Ҫɾ������Ʒ������");
			}

		}

	}

	// ��ͷ
	public static void biaotou() {
		System.out.println();
		System.out.println("================" + "��ӭʹ����Ʒ������ϵͳ" + "================");
		System.out.println("��Ʒ���" + "   " + "��Ʒ����" + "    " + "��Ʒ�۸�" + "    " + "��Ʒ�۸�");
	}
	
	public static void gongneng(){
		System.out.println("1.������Ʒ"+"  "+"2.������Ʒ"+"  "+"3.�޸���Ʒ"+"  "+"4.ɾ����Ʒ"+"  "+"5.�˳�����");
		
	}
	

}
