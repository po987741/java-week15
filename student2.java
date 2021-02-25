package student.com.it;

public class student2 {

	String name;
	int age;
	String color;
	String sex;
	
	public void methodstd1(String n , int a ,String c,String s) {
		name = n;
		age = a;
		color = c;
		sex = s;
	}
	public static void main(String[]args) {
		student2 std1 = new student2();
		
		std1.methodstd1("Jame", 20, "Black","Male");
		
		System.out.println("Student object1");
		System.out.println("name:" + std1.name+":\n age" +std1.age);
		System.out.println("color:" + std1.color+":\n sex:" +std1.sex);
	}
	
}
