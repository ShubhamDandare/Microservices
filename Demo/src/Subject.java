
public class Subject {
	private String name;
	private int code;
	public Subject(String name, int code) {
		super();
		this.name = name;
		this.code = code;
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", code=" + code + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

}
