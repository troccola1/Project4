package Project_4;

public class Employee extends Staff implements ICalculator {
	private String id;
	private String staffName;
	private int employeeAge;
	private int coefficientsSalary;
	private String workingDay;
	private String departmentId;
	private int dayOff;
	private int overtime;

	@Override
	public String toString() {
		return String.format("%-10s%-20s%-20d%-20d%-20s%-20s%-20d%-20b", id, staffName, employeeAge, coefficientsSalary, workingDay, departmentId, dayOff, overtime);
	}

	public Employee(String id, String staffName, int employeeAge, int coefficientsSalary, String workingDay, String departmentId,
			int dayOff, int overtime) {
		super(id, staffName, employeeAge, coefficientsSalary, workingDay, departmentId, dayOff);
		this.overtime = overtime;
	}

	@Override
	public long calculateSalary() {
		return getCoefficientsSalary() * 3000000 + overtime * 200000;
	}
}
