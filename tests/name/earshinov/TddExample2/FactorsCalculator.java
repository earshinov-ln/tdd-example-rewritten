package name.earshinov.TddExample2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FactorsCalculator {

	private Set<Integer> factors;

	public FactorsCalculator(int number) {
		if (number <= 0)
			throw new IllegalArgumentException();
		factors = Collections.unmodifiableSet(calculateFactors(number));
	}

	public Set<Integer> getFactors() {
		return factors;
	}

	private static HashSet<Integer> calculateFactors(int number) {
		HashSet<Integer> factors = new HashSet<Integer>();
		factors.add( 1 ); // 1 - делитель всех чисел
		for (int i = 2; i < Math.sqrt(number); i++)
			if (number % i == 0) {
				factors.add( i );
				factors.add( number / i );
			}
		return factors;
	}

}
