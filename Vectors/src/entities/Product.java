package entities;

public class Product {
	
	public String nome;
	public int idade;
	public double altura;
	
	public Product(int num) {
		this.num = num;
	}

	public Product(int idade, String name, double altura) {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	private int num;

	public double getAltura() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getIdade() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
