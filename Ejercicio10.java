public class Ejercicio10 {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        int c = 5;

        if (a >= b && a >= c) {
            System.out.println("El mayor es: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("El mayor es: " + c);
        }
    }
}
