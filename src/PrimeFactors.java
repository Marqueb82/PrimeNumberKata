import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> getPrimes(int n) {
		List<Integer> primes = new ArrayList<Integer>();

		for (int i = 2; n > 1; i++) {
			for (; n % i == 0; n /= i)
				primes.add(i);
		}

		return primes;
	}

}
