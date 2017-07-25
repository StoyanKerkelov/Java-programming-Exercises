import java.util.Scanner;

public class T1GetAreaOfFigure {
//write a classes Circle, Rectangle and  Square,  which return area of those figures.
	static class Circle {
		double radius;

		Circle(double radius) {
			this.radius = radius;
		}

		int getArea() {
			return (int) Math.ceil(radius * radius * 3.14159265);
		}
	}

	static class Rectangle {
		double width;
		double height;

		Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}

		int getArea() {
			return (int) Math.ceil(width * height);
		}
	}

	static class Square {
		double width;

		Square(double width) {
			this.width = width;
		}

		int getArea() {
			return (int) Math.ceil(width * width);
		}
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		double radius = reader.nextDouble();

		double recWidth = reader.nextDouble();
		double recHeight = reader.nextDouble();

		double radius2 = reader.nextDouble();

		double squareWidth = reader.nextDouble();

		double recWidth2 = reader.nextDouble();
		double recHeight2 = reader.nextDouble();

		Circle circle1 = new Circle(radius);
		System.out.println(circle1.getArea());

		Rectangle rec1 = new Rectangle(recWidth, recHeight);
		System.out.println(rec1.getArea());

		Circle circle2 = new Circle(radius2);
		System.out.println(circle2.getArea());

		Square sqr = new Square(squareWidth);
		System.out.println(sqr.getArea());

		Rectangle rec2 = new Rectangle(recWidth2, recHeight2);
		System.out.println(rec2.getArea());

	}

}
