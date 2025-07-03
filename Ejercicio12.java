public class Ejercicio12 {
    public static void main(String[] args) {
        int numero = 15; // Cambiar para probar otros números

        // Usando AND
        if (numero >= 1 && numero <= 12) {
            System.out.println("Número " + numero + " está en la primera docena");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("Número " + numero + " está en la segunda docena");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("Número " + numero + " está en la tercera docena");
        } else {
            System.out.println("El número " + numero + " está fuera de rango");
        }

        // Usando OR (alternativa no tan eficiente, pero como ejercicio)
        if (!(numero < 1 || numero > 36)) {
            if (numero <= 12) {
                System.out.println("Número " + numero + " está en la primera docena (OR)");
            } else if (numero <= 24) {
                System.out.println("Número " + numero + " está en la segunda docena (OR)");
            } else {
                System.out.println("Número " + numero + " está en la tercera docena (OR)");
            }
        } else {
            System.out.println("El número " + numero + " está fuera de rango (OR)");
        }
    }
}
