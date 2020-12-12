package Project_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

	private static List<Staff> staffs = new ArrayList<>();
	private static List<Department> depts = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public static void displayStaff() {
		// viết code hiển thị thông tin nhân viên
		System.out.println(staffs);
	}

	public static void displayDepartment() {
		// viết code hiển thị thông tin các bộ phận
		System.out.println(depts);
	}

	public static void displayStaffByDepartment() {
		// viết code hiển thị thông tin nhân viên theo từng bộ phận
		for (Department dept : depts) {
//			hiển thị thông tin bộ phận (bằng hàm toString của class Department);
			for (Staff staff : staffs) {
				if (depts.equals(staff)) {
					System.out.println(staff);
//					hiển thị tên nhân viên;
					
				}
			}
		}
	}

	public static void addStaff() {
		System.out.println("Id Nhân viên: ");
		
		System.out.println("Nhập tên nhân viên: ");
//		id = scanner.nextLine();
		System.out.println("Tuổi của nhân viên: ");
		
		System.out.println("Hệ số lương: ");
		
		System.out.println("Ngày làm việc: ");
		
		System.out.println("Id bộ phận: ");
		
		System.out.println("Ngày nghỉ: ");
	}
}
