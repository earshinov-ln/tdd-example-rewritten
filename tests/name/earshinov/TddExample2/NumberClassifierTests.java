package name.earshinov.TddExample2;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberClassifierTests {

	@Test
	public void test_1_is_perfect() {
		NumberClassifier classifier = new NumberClassifier(1);
		assertTrue(classifier.numberIsPerfect());
	}
	
	@Test
	public void test_6_is_perfect() {
		NumberClassifier classifier = new NumberClassifier(6);
		assertTrue(classifier.numberIsPerfect());
	}

}
