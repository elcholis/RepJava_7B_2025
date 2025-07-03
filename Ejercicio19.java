import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        int suma = 0;

        while (count < 10) {
            int num = rand.nextInt(100) + 1; // números del 1 al 100
            System.out.println("Número generado: " + num);
            suma += num;
            count++;
        }

        double promedio = suma / 10.0;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
