package x;

public class Main {
	public static void main(String[] args) {

		// إنشاء بعض الموظفين والإداريين
		SalariedEmployee salariedEmployee1 = new SalariedEmployee(1, "John", 5000);
		SalariedEmployee salariedEmployee2 = new SalariedEmployee(2, "Alice", 6000);
		HourlyEmployee hourlyEmployee1 = new HourlyEmployee(3, "Bob", 15, 40);
		HourlyEmployee hourlyEmployee2 = new HourlyEmployee(4, "Eve", 20, 35);

		// إنشاء بعض الأقسام وتعيين رؤساء الأقسام
		Department department1 = new Department(101, "Engineering", null);
		Department department2 = new Department(102, "Marketing", null);

		// إنشاء بعض المدراء وتعيينهم كرؤساء للأقسام
		Manager manager1 = new Manager(101, "Mike", 8000, 5, 200, department1);
		Manager manager2 = new Manager(102, "Sarah", 7000, 4, 150, department2);

		// تعيين رؤساء الأقسام
		department1.setDepartmentHead(manager1);
		department2.setDepartmentHead(manager2);

		// إنشاء نظام إدارة الموظفين وإضافة الموظفين والأقسام
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		ems.addEmployee(salariedEmployee1);
		ems.addEmployee(salariedEmployee2);
		ems.addEmployee(hourlyEmployee1);
		ems.addEmployee(hourlyEmployee2);
		ems.addEmployee(manager1);
		ems.addEmployee(manager2);

		ems.addDepartment(department1);
		ems.addDepartment(department2);

		// اختبار بعض الوظائف في نظام إدارة الموظفين
		System.out.println("Total salary for department 85: $" + ems.getTotalSalaryByDepartment(85));
		System.out.println("Total salary for department 102: $" + ems.getTotalSalaryByDepartment(102));

		System.out.println("Average salary for department 99: $" + ems.getAverageSalaryByDepartment(99));
		System.out.println("Average salary for department 100: $" + ems.getAverageSalaryByDepartment(100));

	}
}