package name.earshinov.TddExample2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactorsCalculator {
	
	private List<Integer> factors;
	
	public FactorsCalculator(int number) {
		if (number <= 0)
			throw new IllegalArgumentException();
		factors = Collections.unmodifiableList(calculateFactors(number));
	}
	
	public List<Integer> getFactors() {
		return factors;
	}

	private static ArrayList<Integer> calculateFactors(int number) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		factors.add( 1 ); // 1 - делитель всех чисел
		for (int i = 2; i < Math.sqrt(number); i++)
			if (number % i == 0) {
				factors.add( i );
				factors.add( number / i );
			}
		return factors;
	}

}
