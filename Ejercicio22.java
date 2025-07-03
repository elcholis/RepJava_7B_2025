public class Ejercicio22 {
    public static void main(String[] args) {
        int empleadosProcesados = 0;

        while (empleadosProcesados < 10) {
            // Categoría aleatoria: A, B o C
            char categoria;
            int randCat = (int) (Math.random() * 3); // 0, 1, 2
            if (randCat == 0) {
                categoria = 'A';
            } else if (randCat == 1) {
                categoria = 'B';
            } else {
                categoria = 'C';
            }

            // Antigüedad aleatoria: entre 1 y 20 años
            int antiguedad = (int) (Math.random() * 20) + 1;

            // Sueldo bruto aleatorio: entre 25,000 y 60,000
            double sueldoBruto = 25000 + Math.random() * (60000 - 25000);

            // Aumento por antigüedad
            double aumento = 0;
            if (antiguedad >= 1 && antiguedad <= 5) {
                aumento = 0.05;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                aumento = 0.10;
            } else if (antiguedad > 10) {
                aumento = 0.30;
            }

            // Plus por categoría
            double plus = 0;
            switch (categoria) {
                case 'A':
                    plus = 1000;
                    break;
                case 'B':
                    plus = 2000;
                    break;
                case 'C':
                    plus = 3000;
                    break;
            }

            // Cálculo del sueldo neto
            double sueldoNeto = sueldoBruto + (sueldoBruto * aumento) + plus;

            // Mostrar resultados
            System.out.println("Empleado #" + (empleadosProcesados + 1));
            System.out.println("Categoría: " + categoria);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.printf("Sueldo bruto: $%.2f\n", sueldoBruto);
            System.out.printf("Sueldo neto:  $%.2f\n", sueldoNeto);
            System.out.println("------------------------");

            empleadosProcesados++;
        }
    }
}
