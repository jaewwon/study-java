class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
}

public class ReferencePassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle pizza = new Circle(10);
		increase(pizza);
		System.out.println(pizza.radius);
		//11

	}
	
	static void increase(Circle m) {
		m.radius++;
	}

}
