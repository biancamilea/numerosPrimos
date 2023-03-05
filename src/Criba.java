public class Criba {
    // Generate prime numbers from 1 up to max
    public static int[] generatePrimes(int max) {
        if (max < 2) {
            return new int[0];
            // Empty array for max < 2
        }

        // Initialize array
        int size = max + 1;
        boolean[] isPrime = new boolean[size];
        for (int i = 0; i < size; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count number of primes
        int count = 0;
        for (int i = 2; i <= max; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        // Fill prime numbers into array
        int[] primes = new int[count];
        for (int i = 2, j = 0; i <= max; i++) {
            if (isPrime[i]) {
                primes[j++] = i;
            }
        }

        return primes;
    }
}
