package dome1;

public class ceshi {
	public static void main(String[] args) {
		jingli ji = new jingli("º«º®", "0001", 3.8);
		fuwuyuan fu = new fuwuyuan("´ä»¨", "0002");
		chushi chu = new chushi("È«µ°", "0003");
		ji.work();
		System.out.println(ji.getid());
		System.out.println(ji.getname());
		fu.work();
		chu.work();
	}

}
