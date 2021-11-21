package tw.com.sample.entities;

public class Employee {
	private int eid;
	private String eName;
	private String ePass;
	private String eEmail;
	private String eAddress;
	private double salary;
	
	

	public Employee() {
		super();
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getePass() {
		return ePass;
	}

	public void setePass(String ePass) {
		this.ePass = ePass;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", ePass=" + ePass + ", eEmail=" + eEmail + ", eAddress="
				+ eAddress + ", salary=" + salary + "]";
	}

}
