public class Ejercicio18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // Tabla del 1 al 10
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Línea en blanco entre tablas
        }
    }
}
