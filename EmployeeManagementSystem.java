package x;

import java.util.ArrayList;

class EmployeeManagementSystem {
	private ArrayList<Employee> employees;
	private ArrayList<Department> departments;

	public EmployeeManagementSystem() {
		employees = new ArrayList<>();
		departments = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(int employeeId) {
		employees.removeIf(employee -> employee.getId() == employeeId);
	}

	public void addDepartment(Department department) {
		departments.add(department);
	}

	public void removeDepartment(int departmentId) {
		departments.removeIf(department -> department.getDepartmentId() == departmentId);
	}

	public Employee getEmployeeById(int employeeId) {
		for (Employee employee : employees) {
			if (employee.getId() == employeeId) {
				return employee;
			}
		}
		return null;
	}

	public ArrayList<Employee> getEmployeesByDepartment(int departmentId) {
		ArrayList<Employee> departmentEmployees = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee instanceof Manager) {
				Manager manager = (Manager) employee;
				if (manager.getDepartment().getDepartmentId() == departmentId) {
					departmentEmployees.add(employee);
				}
			}
		}
		return departmentEmployees;
	}

	public double getTotalSalaryByDepartment(int departmentId) {
		double totalSalary = 0;
		for (Employee employee : employees) {
			if (employee instanceof Manager) {
				Manager manager = (Manager) employee;
				if (manager.getDepartment().getDepartmentId() == departmentId) {
					totalSalary += employee.calculateSalary();
				}
			}
		}
		return totalSalary;
	}

	public double getAverageSalaryByDepartment(int departmentId) {
		ArrayList<Employee> departmentEmployees = getEmployeesByDepartment(departmentId);
		double totalSalary = getTotalSalaryByDepartment(departmentId);
		return totalSalary / departmentEmployees.size();
	}
}
