
public class Stat {
	double weight,height;
	int age;
	String name;
	public Stat() {
		
	}
	public Stat(String name,double weight,double height, int age) {
		this.name = name;
		this.weight=weight;
		this.height=height;
		this.age=age;
	}
	public void printinfo() {
		System.out.println(name +" ������� ����: " + age + " ����(cm): "+ height + " ������(kg): "+ weight);
		System.out.println("���� ��緮: " +(66.47+(13.75*weight) +5*height-(6.76*age)));
	}
	
}
