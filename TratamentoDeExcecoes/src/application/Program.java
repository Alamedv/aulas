package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
		String [] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			
		}
		catch (ImputMism e) {
			System.out.println("Imput error");
		}
		System.out.println("End of Program");
	
		sc.close();
		
		
	}

}
