package student.com.it;

public class student {
	
	String name;
	int age;
	String color;
	String sex;
	
	
	public static void main(String[]args) {
		
		student std1 = new student();
		student std2 = new student();
		student std3 = new student();
		
		std1.name = "james";
		std1.age = 20;
		std1.color = "black";
		std1.sex = "Male";
		
		std2.name = "james";
		std2.age = 20;
		std2.color = "black";
		std2.sex = "Male";
		
		std3.name = "PO";
		std3.age = 19;
		std3.color = "black";
		std3.sex = "Male";
		
		System.out.println("Student object1");
		System.out.println(" name: " + std1.name + ":\n age: " + std1.age);
		System.out.println(" color: " + std1.color + ":\n sex: " + std1.sex+"\n");
		
		
		System.out.println("Student object2");
		System.out.println(" name: " + std2.name + ":\n age: " + std2.age);
		System.out.println(" color: " + std2.color + ":\n sex: " + std2.sex +"\n");
		
		System.out.println("Student object2");
		System.out.println(" name: " + std3.name + ":\n age: " + std3.age);
		System.out.println(" color: " + std3.color + ":\n sex: " + std3.sex +"\n");
	}

}
