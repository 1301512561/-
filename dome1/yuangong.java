package dome1;

public abstract class yuangong {
	private String name;
	private String id;

	public yuangong() {

	}

	public yuangong(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public abstract void work();

	public void setname(String name) {
		this.name = name;

	}

	public void setid(String id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public String getid() {
		return id;
	}

}
