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
			System.out.println("输入要选择的功能序号");
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
				System.out.println("输入的功能序号不正确，请重新输入");
				break;
			}

		}

	}

	// 超市商品初始化
	public static void init() {

	}

	static void init(ArrayList<chaoshi> arr) {

		chaoshi chao = new chaoshi();
		chao.a = 10;
		chao.i = "可乐";
		chao.ID = 10001;
		chao.p = 3;
		arr.add(chao);

		chaoshi chao1 = new chaoshi();
		chao1.a = 20;
		chao1.i = "薯片";
		chao1.ID = 10002;
		chao1.p = 3.5;
		arr.add(chao1);

		chaoshi chao2 = new chaoshi();
		chao2.a = 30;
		chao2.i = "海苔";
		chao2.ID = 10003;
		chao2.p = 6.7;
		arr.add(chao2);

	}

	// 商品遍历
	public static void baili(ArrayList<chaoshi> arr) {
		int i = 0;
		for (i = 0; i < arr.size(); i++) {
			chaoshi shi = new chaoshi();
			shi = arr.get(i);
			System.out.println(shi.ID + "  " + shi.i + "           " + shi.p + "     " + shi.a);
		}
	}

	// 添加商品
	public static void zengjia(ArrayList<chaoshi> arr) {

		chaoshi shi1 = new chaoshi();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入新商品的编号");
		shi1.ID = sc.nextInt();
		System.out.println("请输入新商品的名称");
		shi1.i = sc.next();
		System.out.println("请输入新商品的价格");
		shi1.p = sc.nextDouble();
		System.out.println("请输入新商品的库存");
		shi1.a = sc.nextInt();
		arr.add(shi1);
	}

	// 修改商品
	public static void xiugai(ArrayList<chaoshi> arr) {
		chaoshi shi2 = new chaoshi();
		System.out.println("请输入要修改的商品的编号");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		for (int i = 0; i < arr.size(); i++) {
			shi2 = arr.get(i);
			if (shi2.ID == a) {
				System.out.println("已找到要修改的商品");
				System.out.println("请输入新的上品编号");
				shi2.ID = sc.nextInt();
				System.out.println("请输入新的商品的名称");
				shi2.i = sc.next();
				System.out.println("请输入新商品的价格");
				shi2.p = sc.nextDouble();
				System.out.println("请输入新商品的库存");
				shi2.a = sc.nextInt();
				return;
			}
			b = b + 1;
			if (b == arr.size() - 1) {
				System.out.println("要修改的商品不存在");
			}

		}
	}

	// 删除商品
	public static void shanchu(ArrayList<chaoshi> arr) {
		chaoshi shi3 = new chaoshi();
		System.out.println("请输入要删除的商品编号");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int i;
		int c = 0;
		for (i = 0; i < arr.size(); i++) {
			shi3 = arr.get(i);
			if (shi3.ID == b) {
				System.out.println("找到要删除的商品");
				arr.remove(i);
				System.out.println("商品删除成功");
				return;
			}
			c = c + 1;
			if (c == arr.size()) {
				System.out.println("要删除的商品不存在");
			}

		}

	}

	// 表头
	public static void biaotou() {
		System.out.println();
		System.out.println("================" + "欢迎使用商品库存管理系统" + "================");
		System.out.println("商品编号" + "   " + "商品名称" + "    " + "商品价格" + "    " + "商品价格");
	}
	
	public static void gongneng(){
		System.out.println("1.遍历商品"+"  "+"2.增加商品"+"  "+"3.修改商品"+"  "+"4.删除商品"+"  "+"5.退出程序");
		
	}
	

}
