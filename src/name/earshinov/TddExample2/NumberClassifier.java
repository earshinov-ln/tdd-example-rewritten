package name.earshinov.TddExample2;

public class NumberClassifier {

	private final int number;

	public NumberClassifier(int number) {
		if (number <= 0)
			throw new IllegalArgumentException();
		this.number = number;
	}

	public boolean numberIsPerfect() {
		int sumOfDivisors = 1; // 1 - делитель любого числа
		for (int i = 2; i < Math.sqrt(number); i++)
			if (number % i == 0) {
				sumOfDivisors += i;
				sumOfDivisors += number / i;
			}
		return sumOfDivisors == number;
	}

}
