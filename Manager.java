package x;

class Manager extends SalariedEmployee {
	private int teamSize;
	private double bonus;
	private Department department;

	public Manager(int id, String name, double baseSalary, int teamSize, double bonus, Department department) {
		super(id, name, baseSalary);
		this.teamSize = teamSize;
		this.bonus = bonus;
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double calculateSalary() {
		return getBaseSalary() + (teamSize * bonus);
	}
}