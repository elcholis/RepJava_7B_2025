import java.util.Random;

public class Ejercicio20 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        do {
            int num = rand.nextInt(100) + 1;
            System.out.println("Número generado: " + num);

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

            count++;
        } while (count < 10);

        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
    }
}

