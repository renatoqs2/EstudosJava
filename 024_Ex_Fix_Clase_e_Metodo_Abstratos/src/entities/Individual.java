package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double helthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = helthExpenditures;
	}

	public Double getHelthExpenditures() {
		return healthExpenditures;
	}

	public void setHelthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double totalTax() {
		if (super.getAnualIncome() < 20000.00) {
			return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		} else {
			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
	}

}
