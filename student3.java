package student.com.it;
import java.util.Scanner;

public class student3 {
	//instance variable
		String name;
		int age;
		String color;
		String sex;
		
		//1.create a constructor of class//method constructor of class
		public student3(String n,int a,String c,String s){
		//2.Data input for Student Object1
			name = n;
			age = a;
			color = c;
			sex = s;
		}
		
		private void methodstd1() {
			//4.Display all data objects1
				System.out.println("Student object1");
				System.out.println(" name: " + name + ":\n age: " + age);
				System.out.println(" color: " + color + ":\n sex: " + sex+"\n");
		}
		
		//3.Main method
		public static void main(String[]args) {
			//3.1 create object here
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter any value of name: ");
			String name = sc.nextLine();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.print("Enter any value of age: ");
			int age = sc2.nextInt();
			
			Scanner sc3 = new Scanner(System.in);
			System.out.print("Enter any value of hair color: ");
			String color = sc3.nextLine();
			
			Scanner sc4 = new Scanner(System.in);
			System.out.print("Enter any value of sex: ");
			String sex = sc4.nextLine();
			
			Student3 Std1 = new Student3(name,age,color,sex);
			Std1.methodStd1();
	}
}
