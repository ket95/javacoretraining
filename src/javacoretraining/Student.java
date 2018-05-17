package javacoretraining;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Student {
	String name;
	int age;
	String nameSchool;
	String deptName;
	String currentAdress;
	String homeTown;
	String id;
	String bankAccount;

	public Student(String name, int age, String nameSchool, String deptName, String currentAdress, String homeTown,
			String id, String bankAccount) {
		super();
		this.name = name;
		this.age = age;
		this.nameSchool = nameSchool;
		this.deptName = deptName;
		this.currentAdress = currentAdress;
		this.homeTown = homeTown;
		this.id = id;
		this.bankAccount = bankAccount;
	}

	public void updateStudent(String address, String bankAccount) {
		this.currentAdress = address;
		this.bankAccount = bankAccount;
	}

	public void showInfor() {
		System.out.println("--------------| thông tin sinh viên |------------");
		System.out.println("ho tên sinh vien: " + getName());
		System.out.println("ma sinh viên: " + getId());
		System.out.println("tuổi: " + getAge());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNameSchool() {
		return nameSchool;
	}

	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getCurrentAdress() {
		return currentAdress;
	}

	public void setCurrentAdress(String currentAdress) {
		this.currentAdress = currentAdress;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBankAcount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	
}
