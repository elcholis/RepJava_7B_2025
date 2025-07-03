public class Ejercicio7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 17;

        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
