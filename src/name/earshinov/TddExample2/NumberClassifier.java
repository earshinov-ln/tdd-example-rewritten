package name.earshinov.TddExample2;

public class NumberClassifier {

	final int number;
	FactorsCalculator factorsCalculator;

	public NumberClassifier(int number) {
		this.number = number;
		factorsCalculator = new FactorsCalculator(number);
	}

	public boolean numberIsPerfect() {
		return getSumOfDivisors() == number;
	}

	public boolean numberIsAbundant() {
		return getSumOfDivisors() > number;
	}

	public boolean numberIsDeficient() {
		return getSumOfDivisors() < number;
	}

	private int getSumOfDivisors() {
		int sum = 0;
		for (Integer v : factorsCalculator.getFactors())
			sum += v;
		return sum;
	}

}
