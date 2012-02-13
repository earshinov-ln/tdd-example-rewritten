package name.earshinov.TddExample2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class FactorsCalculatorTests {

	@Test(expected=IllegalArgumentException.class)
	public void test_minus_6_throws() {
		FactorsCalculator calc = new FactorsCalculator(-6);
		calc.getFactors();
	}

	@Test(expected=IllegalArgumentException.class)
	public void test_minus_1_throws() {
		FactorsCalculator calc = new FactorsCalculator(-1);
		calc.getFactors();
	}

	@Test(expected=IllegalArgumentException.class)
	public void test_0_throws() {
		FactorsCalculator calc = new FactorsCalculator(0);
		calc.getFactors();
	}

	@Test
	public void test_factors_for_1() {
		FactorsCalculator calc = new FactorsCalculator(1);
		assertEquals(new HashSet<Integer>(Arrays.asList(1)), calc.getFactors());
	}

	@Test
	public void test_factors_for_6() {
		FactorsCalculator calc = new FactorsCalculator(6);
		assertEquals(new HashSet<Integer>(Arrays.asList(1, 2, 3)), calc.getFactors());
	}

	@Test
	public void test_factors_for_12() {
		FactorsCalculator calc = new FactorsCalculator(12);
		assertEquals(new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 6)), calc.getFactors());
	}
	
	@Test
	public void test_factors_for_27() {
		FactorsCalculator calc = new FactorsCalculator(27);
		assertEquals(new HashSet<Integer>(Arrays.asList(1, 3, 9)), calc.getFactors());
	}

	@Test
	public void test_factors_for_28() {
		FactorsCalculator calc = new FactorsCalculator(28);
		assertEquals(new HashSet<Integer>(Arrays.asList(1, 2, 4, 7, 14)), calc.getFactors());
	}

}
