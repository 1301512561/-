package ������;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Shopp.dome_1;

public class dianming {

	public static void main(String[] args) {

		ArrayList<Deom> arr = new ArrayList<>();
		biaotou();
		init(arr);

		while (true) {
			biaotou();
			switch (fan()) {
			case 1:
				tianjian(arr);
				break;
			case 2:
				chazhao(arr);
				break;
			case 3:
				return;

			default:
				System.out.println("��������");
				break;
			}
		}

	}

	// �����ѧ��
	public static void tianjian(ArrayList<Deom> arr) {
		Deom de = new Deom();
		Scanner sc = new Scanner(System.in);

		System.out.println("�����������ͬѧ������");
		de.name = sc.next();

		arr.add(de);
	}

	// ����ѧ��
	public static void chazhao(ArrayList<Deom> arr) {
		Random ran = new Random();
		int i;
		i = ran.nextInt(arr.size());
		Deom a = new Deom();
		a = arr.get(i);
		System.out.println(a.name);
	}

	// ��ͷ
	public static void biaotou() {

		System.out.println("=============" + "�������ϵͳ" + "=============");
		System.out.println("1.�����ѧ��" + "   " + "2.�������" + "   " + "3.�˳�����");
	}

	// ����ѡ��
	public static int fan() {
		Scanner sc = new Scanner(System.in);
		int i;
		i = sc.nextInt();
		return i;
	}

	public static void init(ArrayList<Deom> arr) {
		Deom d = new Deom();
		d.name = "����";
		System.out.println(d.name);

		Deom a = new Deom();
		a.name = "����";
		System.out.println(a.name);

		Deom d1 = new Deom();
		d1.name = "����";
		System.out.println(d1.name);

		Deom d2 = new Deom();
		d2.name = "����˿";
		System.out.println(d2.name);

		Deom d3 = new Deom();
		d3.name = "����";
		System.out.println(d3.name);
		arr.add(d);
		arr.add(a);
		arr.add(d3);
		arr.add(d1);
		arr.add(d2);
	}

}
