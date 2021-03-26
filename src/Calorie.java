import java.util.Scanner;

public class Calorie {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(num != 5) {
			System.out.println("*** Calorie management System Menu ***");
			System.out.println("1.Add calorie ");
			System.out.println("2.Delete calorie");
			System.out.println("3.Edit users");
			System.out.println("4.View users");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1-5: ");
			num = input.nextInt();
			switch(num) {
			case 1:
				addcalorie();	
				
			case 2:
				deletecalorie();	
			case 3:
				edit();
			case 4:
				view();
				
	          }
		}
	}
	public static void addcalorie() {
		Scanner input = new Scanner(System.in);
		System.out.println("������� ����:  ");
		double age = input.nextDouble();
		System.out.println("����(cm): ");
		double height = input.nextDouble();
		System.out.println("������(kg): ");
		double weight = input.nextDouble();
		System.out.print(66.47+(13.75*weight) +5*height-(6.76*age) + "kcal�� ����� ���ʴ�緮�Դϴ�.");
		double a =66.47+(13.75*weight) +5*height-(6.76*age);
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
		
	public static void deletecalorie() {
		addcalorie();
	}
	public static void edit() {
		Scanner input = new Scanner(System.in); //������� ��ü���� ����
		System.out.println("������� ����:  ");
		double age = input.nextDouble();
		System.out.println("����(cm): ");
		double height = input.nextDouble();
		System.out.println("������(kg): ");
		double weight = input.nextDouble();
		System.out.print(66.47+(13.75*weight) +5*height-(6.76*age) + "kcal�� ����� ���ʴ�緮�Դϴ�.");
		double a =66.47+(13.75*weight) +5*height-(6.76*age);
		System.out.print("����: " +age);
		System.out.print("����(cm): " +height);
		System.out.print("������(kg): " +weight);
		System.out.print("���ʴ�緮(kcal): " +a);
		
	}
	public static void view() {
		edit();
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
	

