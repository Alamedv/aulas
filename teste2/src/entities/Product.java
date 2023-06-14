package entities;

public class Product {

public Product(double nume) {
		this.nume = nume;
	}

public double getNume() {
	return nume;
}

public void setNume(double nume) {
	this.nume = nume;
}

public Product(int num) {
		this.num = num;
	}

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

private int num;
private double nume;

	
}
