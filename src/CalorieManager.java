import java.util.Scanner;

public class CalorieManager {
	Scanner input;
	Stat stat;
	CalorieManager(Scanner input){
		this.input = input;
	}
	public void addcalorie() {
		stat = new Stat();
		System.out.println("������� �̸�:");
		stat.name=input.next();
		System.out.println("������� ����:");
		stat.age=input.nextInt();
		System.out.println("����(cm):");
		stat.height=input.nextDouble();
		System.out.println("������(kg):");
		stat.weight=input.nextDouble();
		System.out.println("***  ���� ��ħ �Ĵ� ***");
		System.out.println("1.����"); 
		System.out.println("2.����"); 
		int morning = input.nextInt();
		if(morning ==1) {
			System.out.println("549kcal�Դϴ�");
		}
		else{
			System.out.println("0kcal�Դϴ�");
		}
		System.out.println("��ħ�� ������ Į�θ��� �Է��ϼ���");
		int m = input.nextInt();
		
		System.out.println("***  ���� ���� �Ĵ� ***");
		diet();
		int lunch = input.nextInt();
		if(lunch==1) {
			System.out.println("1400kcal�Դϴ�");
		}
		else if(lunch==2) {
			System.out.println("1200kcal�Դϴ�");
		}
		else if(lunch ==3) {
			System.out.println("975kcal�Դϴ�");
		}
		else if(lunch==4) {
			System.out.println("545kcal�Դϴ�");
		}
		else if(lunch ==5) {
			System.out.println("450kcal�Դϴ�");
		}
		else if(lunch ==6) {
			System.out.println("500kcal�Դϴ�");
		}
		else {
			System.out.println("0kcal�Դϴ�");
		}
		System.out.println("���ɿ� ������ Į�θ��� �Է��ϼ���");
		int l = input.nextInt();
		
		System.out.println("***  ���� ���� �Ĵ� ***");
		diet();
		int dinner = input.nextInt();
		if(dinner==1) {
		
			System.out.println("1400kcal�Դϴ�");
		}
		else if(dinner==2) {
			System.out.println("1200kcal�Դϴ�");
		}
		else if(dinner ==3) {
			System.out.println("975kcal�Դϴ�");
		}
		else if(dinner==4) {
			System.out.println("545kcal�Դϴ�");
		}
		else if(dinner ==5) {
			System.out.println("450kcal�Դϴ�");
		}
		else if(dinner==6) {
			System.out.println("500kcal�Դϴ�");
		}
		else {
			System.out.println("0kcal�Դϴ�");
		}
		System.out.println("���ῡ ������ Į�θ��� �Է��ϼ���");
		int d = input.nextInt();
		System.out.println("�� ������ Į�θ� ���Դϴ�: " + (m+l+d));
		}
		
	public void deletecalorie() {
		System.out.println("users name:");	
		String name = input.next();
		if(stat == null) {
			System.out.println("your stats have not been registerd");
			return;
		}
		if(stat.name.equals(name)) {
			stat = null;
			System.out.println("your stats are deleted");
		}
	}
	public void edit() {
		System.out.print("users name:");
		String name = input.next();
		if(stat.name.equals(name)) {
			System.out.println("����(cm):");
			stat.height=input.nextDouble();
			System.out.println("������(kg):");
			stat.weight=input.nextDouble();
			System.out.println("edit: " +stat.height +" cm "+ stat.weight +" kg");
		}
	}
	public void view() {
		System.out.println("users name:");
		String name = input.next();
		if(stat.name.equals(name)) {
			stat.printinfo();
		}
	}
		
		
	public static void diet() {
		System.out.println("1.���Ϳ��ۼ�Ʈ");
		System.out.println("2.¥��� +������");
		System.out.println("3.���̳�����(���ްŽ� ������ũ 3����)");
		System.out.println("4.����");
		System.out.println("5.���� ��� 2�� + ����"); 
		System.out.println("6.���"); 
		System.out.println("7.����"); 
	}

}
	

