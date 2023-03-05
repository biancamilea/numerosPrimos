/**

 La clase Criba contiene el método estático generarPrimos, el cual devuelve un array de números primos

 hasta un número máximo dado.
 */
public class Criba {

    /**

     Genera un array con los números primos hasta el número máximo dado.

     @param max el número máximo hasta el cual se generarán los números primos.

     @return un array de números primos.
     */
    public static int[] generarPrimos(int max) {
        int i, j;

        // Se comprueba que el número máximo es mayor o igual a 2.
        if (max >= 2) {
            // Se declara un array de booleanos para marcar qué números son primos.
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[dim];
            // Se inicializa el array con todos los elementos a true.
            for (i = 0; i < dim; i++) {
                esPrimo[i] = true;
            }

            // Se marcan el 0 y el 1 como no primos.
            esPrimo[0] = esPrimo[1] = false;

            // Se utiliza la criba de Eratóstenes para marcar los números no primos.
            for (i = 2; i < Math.sqrt(dim) + 1; i++) {
                if (esPrimo[i]) {
                    // Se eliminan los múltiplos de i marcándolos como no primos.
                    for (j = 2 * i; j < dim; j += i) {
                        esPrimo[j] = false;
                    }
                }
            }

            // Se cuenta el número de números primos encontrados.
            int cuenta = 0;
            for (i = 0; i < dim; i++) {
                if (esPrimo[i]) {
                    cuenta++;
                }
            }

            // Se rellena el array de números primos.
            int[] primos = new int[cuenta];
            for (i = 0, j = 0; i < dim; i++) {
                if (esPrimo[i]) {
                    primos[j++] = i;
                }
            }
            return primos;
        } else { // max < 2
            // Si el número máximo es menor que 2 se devuelve un array vacío.
            return new int[0];
        }
    }
}
