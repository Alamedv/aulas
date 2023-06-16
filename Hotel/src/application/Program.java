package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Room number: ");
		int numberRoom = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());
		Reservation reservation = new Reservation(numberRoom, checkIn, checkOut);
		System.out.print("Reservation: " + reservation);
		
		System.out.print("\n\nEnter data to update the reservation:");
		System.out.print("\nCheck-in date (dd/MM/yyyy): ");
		checkIn = sdf.parse(sc.next());
		System.out.println("Check-out date (dd/MM/yyyy): ");
		checkOut = sdf.parse(sc.next());
		System.out.println("Reservation: " + reservation);
		reservation.updateDates(checkIn, checkOut);
		sc.close();
	}
	catch (ParseException e) {
		System.out.println("Invalid date format!");
	}
	catch (DomainException e) {
		System.out.println("Error in reservation: " + e.getMessage());
	}
	catch (RuntimeException e) {
		System.out.println("Unexpected error!");
	}
	
	}
}
