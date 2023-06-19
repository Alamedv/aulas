package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DateTimeFormatter smt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados do aluguel:");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), smt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm: ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), smt);
		
		CarRental carRent = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: ");
		double hourPrice = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double dayPrice = sc.nextDouble();
		
		RentalService rent = new RentalService(dayPrice, hourPrice, new BrazilTaxService());
		rent.processInvoice(carRent);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: " + String.format("%.2f", carRent.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", carRent.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", carRent.getInvoice().getTotalPayment()));		
		
		
		
		
		
		sc.close();
		
	}

}
