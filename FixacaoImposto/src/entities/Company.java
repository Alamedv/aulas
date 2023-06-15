package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Company() {
		super();
	}


	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double basicTax = (numberOfEmployees <= 10) ? getAnualIncome() * 0.16 : getAnualIncome() * 0.14;
		return basicTax;
	}
	
	
}
