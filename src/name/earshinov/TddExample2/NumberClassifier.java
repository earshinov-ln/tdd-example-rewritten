package name.earshinov.TddExample2;

public class NumberClassifier {

	private final int number;

	public NumberClassifier(int number) {
		this.number = number;
	}

	public boolean numberIsPerfect() {
		int sumOfDivisors = 1; // 1 - делитель любого числа
		for (int i = 2; i < number; i++)
			if (number % i == 0)
				sumOfDivisors += i;
		return sumOfDivisors == number;
	}
	
}
