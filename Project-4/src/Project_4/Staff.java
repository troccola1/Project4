 package Project_4;

public abstract class Staff {
	private String id;
	private String staffName;
	private int employeeAge;
	private int coefficientsSalary;
	private String workingDay;
	private String departmentId;
	private int dayOff;

	protected Staff(String id, String staffName, int employeeAge, int coefficientsSalary, String workingDay, String departmentId,int dayOff) {
		this.id = id;
		this.staffName = staffName;
		this.employeeAge = employeeAge;
		this.coefficientsSalary = coefficientsSalary;
		this.workingDay = workingDay;
		this.departmentId = departmentId;
		this.dayOff = dayOff;
	}

	public String getId() {
		return id;
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

	public void setSalary(int coefficientsSalary) {
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

	public abstract String toString();

}
