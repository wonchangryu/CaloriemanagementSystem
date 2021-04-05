
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
		System.out.println(name +" 사용자의 나이: " + age + " 신장(cm): "+ height + " 몸무게(kg): "+ weight);
		System.out.println("기초 대사량: " +(66.47+(13.75*weight) +5*height-(6.76*age)));
	}
	
}
