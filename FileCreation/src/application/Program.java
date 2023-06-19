package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List <Product> list = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File (sourceFolderStr + "\\out").mkdir();
		System.out.println("Folder created: " + success);
		
		String archive = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			String itemArchive = br.readLine();
			
			while (itemArchive != null) {
				String [] fields = itemArchive.split(",");
				String name = fields [0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, quantity, price));
				
				itemArchive = br.readLine();
				
				
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(archive))){
				for (Product item : list) {
					bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
					bw.newLine();
				}
			System.out.println(archive + " CREATED!");
				
			}
		}
		catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		sc.close();		
	}

}
