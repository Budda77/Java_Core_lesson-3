package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(25.4, 34.6);
		
		System.out.println(rec1);
		System.out.println(rec2);
		System.out.println();
		
		double perimeter1 = rec1.perimeter(8, 2);
		System.out.println("Периметр прямокутника1 = " + perimeter1);
		
		double square1 = rec1.square(8, 2);
		System.out.println("Площа прямокутника1 = " + square1);
		
		System.out.println();
		
		rec1.setLength(41.5);
		rec1.setWidth(22.6);
		
		double perimeter2 = rec1.perimeter(rec1.getLength(), rec1.getWidth());
		System.out.println("Периметр прямокутника1_new argument = " + perimeter2);		
		System.out.println("Периметр прямокутника1_new argument= " + rec1.perimeter());
		System.out.println("Площа прямокутника1_new argument= " + rec1.square());
		
		System.out.println();
				
		System.out.println("Периметр прямокутника2 = " + rec2.perimeter());
		System.out.println("Площа прямокутника2 = " + rec2.square());
		System.out.println();
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(12.6);
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.setDiameter(9);
		
		// Визначаємо площу кола;
		double S1 = c2.circleSquare();
		double S2 = c2.circleSquare(8);
		double S3 = c1.circleSquare();
		
		System.out.println("Площа кола 1 = " + S1);
		System.out.println("Площа кола 2 = " + S2);
		System.out.println("Площа кола 3 = " + S3);
		
		// Визначаємо довжину кола;
		
		double L1 = c1.circleLength();
		double L2 = c1.circleLength(24.6);
		double L3 = c2.circleLength();
		c1.setRadius(14.2);
		double L4 = c1.circleLength(c1.getRadius());
	
		
		System.out.println("Довжина кола 1 = " + L1);
		System.out.println("Довжина кола 2 = " + L2);
		System.out.println("Довжина кола 3 = " + L3);
		System.out.println("Довжина кола 4 = " + L4);
		
		
		
		
		
		
		//System.out.println(rec2);
		/* 
		Animal an1 = new Animal();
		
		an1.setAge(12);
		an1.setName("Ivan");
		an1.setColor("white");
		
		Animal an2 = new Animal(25);
		Animal an3 = new Animal("Gorrila", "Mike", 50, "black");
		
		System.out.println(an1);
		System.out.println(an1.getAge());
		System.out.println(an2);
		System.out.println(an3);
		*/

	}

}
