package pe.unsa.epcc;

public class person {
	
	private String name;
	private Integer age;

	public person() {	
	}

	public person(String name,Integer age) {
		this.name=name;
		this.age=age;
	}

	public String getName () {
		return this.name;
	}
	public Integer getAge() {
		return this.age;
	}

	public void setName (String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
