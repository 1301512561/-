package dome;

public class person {
	private String name;
	private int age;

	public person() {

	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof person) {
			person p = (person) obj;
			return this.age == p.age;
		}
		return false;
	}

	public String toString() {
		return name+"  "+age;
	}
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
