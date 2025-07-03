public class Ejercicio17b {
    public static void main(String[] args) {
        int n = 10; // Último número en la lista del 1 al n
        int suma = 0;

        // La cantidad de números pares hasta n es n/2 (si n es par)
        // Suma de números pares = 2 + 4 + 6 + ... + 2k = 2(1 + 2 + ... + k) = 2 * k(k+1)/2 = k(k+1)
        int k = n / 2;
        suma = k * (k + 1);

        System.out.println("Suma de valores pares sin if: " + suma);
    }
}
