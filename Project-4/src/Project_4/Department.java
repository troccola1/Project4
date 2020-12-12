package Project_4;

public class Department {
	private String partCode;
	private String partName;
	private int numberEmployees;

	public String getPartCode() {
		return partCode;
	}

	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-20s%-20%d", partCode, partName, numberEmployees);
	}
}
