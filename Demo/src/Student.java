
public class Student {
	
	private int id;
	private String name;
	private double percent;
	private Integer age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percent=" + percent + ", age=" + age + "]";
	}
	public Student(int id, String name, double percent, int age) {
		super();
		this.id = id;
		this.name = name;
		this.percent = percent;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
