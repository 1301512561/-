package dome1;

public class jingli extends yuangong {
	private double money;
	public jingli() {
		
	}
	public jingli(String name, String id,double money) {
		super(name,id);
		this.money = money;
		
	}

	public void work() {
		System.out.println("¼à¶½¹¤×÷");
	}

	public void setmoney(double money) {
		this.money = money;
	}
	public double getmoney() {
		return money;
	}
}
