package next0228;

public class InstanceRunner extends Instance{
	public int studentNo;
	
	public InstanceRunner(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	public void study() {
		System.out.println("studying");
	}
}
