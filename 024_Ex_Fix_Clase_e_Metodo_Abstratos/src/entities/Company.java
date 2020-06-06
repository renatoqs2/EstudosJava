package entities;
public class Company extends TaxPayer {

	private int employees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	@Override
	public Double totalTax() {
		if (getEmployees() > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
	}

}
