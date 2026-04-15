
package x;

class SalariedEmployee extends Employee {
	private double baseSalary;

	public SalariedEmployee(int id, String name, double baseSalary) {
		super(id, name);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public double calculateSalary() {
		return baseSalary;
	}
}

