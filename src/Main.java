/**

 La clase Main es la clase principal del programa que utiliza la clase Criba para
 generar números primos.
 */
import java.util.Scanner;
public class Main {

    /**
     * El método main recibe un número máximo desde el usuario y muestra por consola
     * un vector con los números primos generados por la clase Criba.
     *
     * @param args los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número máximo para la criba de Eratóstenes:");
        int dato = teclado.nextInt();

        // Mostrar vector inicial
        int vector[] = new int[dato];
        System.out.println("\nVector inicial hasta: " + dato);
        for (int i = 0; i < vector.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(i + 1 + "\t");
        }

        // Generar vector de primos y mostrarlo
        vector = Criba.generarPrimos(dato);
        System.out.println("\nVector de primos hasta: " + dato);
        for (int i = 0; i < vector.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(vector[i] + "\t");
        }
    }
}