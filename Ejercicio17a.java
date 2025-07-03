public class Ejercicio17a {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                suma += num;
            }
        }

        System.out.println("Suma de valores pares: " + suma);
    }
}
