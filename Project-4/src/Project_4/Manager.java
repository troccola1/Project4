package Project_4;

public class Manager extends Staff implements ICalculator {
	private String id;
	private String staffName;
	private int employeeAge;
	private int coefficientsSalary;
	private String workingDay;
	private String departmentId;
	private int dayOff;
	private String position;

	@Override
	public String toString() {
		return String.format("%-10s%-20s%-20d%-20d%-20s%-20s%-20d%-20s", id, staffName, employeeAge, coefficientsSalary,
				workingDay, departmentId, dayOff, position);
	}

	public Manager(String id, String staffName, int employeeAge, int coefficientsSalary, String workingDay,
			String departmentId, int dayOff, String position) {
		super(id, staffName, employeeAge, coefficientsSalary, workingDay, departmentId, dayOff);
		this.position = position;
	}

	public String getId() {
		return id;
	}

	@Override
	public long calculateSalary() {
		int positionSalary = 0;
		if ("Business Leader".equals(position)) {
			positionSalary = 8000000;
		} else if ("Project Leader".equals(position)) {
			positionSalary = 5000000;
		} else if ("Technical Leader".equals(position)) {
			positionSalary = 6000000;
		}
		return this.getCoefficientsSalary() * 5000000 + positionSalary;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public int getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(int coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getWorkingDay() {
		return workingDay;
	}

	public void setWorkingDay(String workingDay) {	
		this.workingDay = workingDay;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public int getDayOff() {
		return dayOff;
	}

	public void setDayOff(int dayOff) {
		this.dayOff = dayOff;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}