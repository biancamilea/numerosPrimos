import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes:");
        int maxNumber = scanner.nextInt();
        int[] primes = Criba.generatePrimes(maxNumber);

        System.out.println("\nVector inicial hasta " + maxNumber + ":");
        printNumbersUpTo(maxNumber);

        System.out.println("\nVector de primos hasta " + maxNumber + ":");
        printNumbers(primes);
    }

    private static void printNumbersUpTo(int maxNumber) {
        for (int i = 0; i < maxNumber; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print((i + 1) + "\t");
        }
    }

    private static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(numbers[i] + "\t");
        }
    }
}