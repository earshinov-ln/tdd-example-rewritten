package name.earshinov.TddExample2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FactorsCalculatorTests {

	@Test
	public void test_factors_for_1() {
		FactorsCalculator calc = new FactorsCalculator(1);
		assertEquals(Arrays.asList(1), calc.getFactors());
	}

}
