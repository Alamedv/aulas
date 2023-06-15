package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Shape #" + i + " data:\nRectangle or Circle (r/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED):");
			sc.nextLine();
			String color = sc.nextLine();

			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(Color.valueOf(color), width, height));

			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();

				list.add(new Circle(Color.valueOf(color), radius));
			}

			
		}
	
		System.out.println("\nSHAPE AREAS:");
		for (Shape sh : list) {
			System.out.println(String.format("%.2f", sh.area()) + " - " + sh.getColor());
		}
		sc.close();

	}

}
