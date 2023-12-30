import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Type your name, city, age separate with blank");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("name is " + name + ", ");
		
		String city = scanner.next();
		System.out.print("city is " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.print("age is " + age + ".");
		
		scanner.close();
		//Type your name, city, age separate with blank
		//jaewwon jeju 26
		//name is jaewwon, city is jeju, age is 26.

	}

}
