import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {

	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactors.getPrimes(1));
	}

	@Test
	public void testTwo() {
		assertEquals(list(2), PrimeFactors.getPrimes(2));
	}

	@Test
	public void testThree() {
		assertEquals(list(3), PrimeFactors.getPrimes(3));
	}

	@Test
	public void testFour() {
		assertEquals(list(2, 2), PrimeFactors.getPrimes(4));
	}

	@Test
	public void testFive() {
		assertEquals(list(2, 3), PrimeFactors.getPrimes(6));
	}

	@Test
	public void testSix() {
		assertEquals(list(2, 2, 2), PrimeFactors.getPrimes(8));
	}

	@Test
	public void testSeven() {
		assertEquals(list(3, 3), PrimeFactors.getPrimes(9));
	}

	private List<Integer> list(int... ints) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ints) {
			list.add(i);
		}
		return list;
	}

}
