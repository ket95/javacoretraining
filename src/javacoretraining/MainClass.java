package javacoretraining;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student sinhVien1 = new Student("Bùi văn kết", 23, "kim thanh hight school", "hehe", "Hải Dương", "Kim thành", "1234", "4342342");
		sinhVien1.showInfor();
		sinhVien1.updateStudent("nam dinh", "4321");
		System.out.println("địa chỉ: " + sinhVien1.getCurrentAdress()+"\n"+ "so tai khoan: " + sinhVien1.getBankAcount());
	}

}
