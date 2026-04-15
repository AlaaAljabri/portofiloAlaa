package x;

class Department {

	private int departmentId;
	private String departmentName;
	private Manager departmentHead;

	public Department(int departmentId, String departmentName, Manager departmentHead) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentHead = departmentHead;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Manager getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(Manager departmentHead) {
		this.departmentHead = departmentHead;
	}
}
