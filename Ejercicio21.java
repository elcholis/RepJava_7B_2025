public class Ejercicio21 {
    public static void main(String[] args) {
        char categoria = 'B';  // 'A', 'B' o 'C'
        int antiguedad = 7;    // años
        double sueldoBruto = 30000;

        double aumento = 0;
        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = 0.10;
        } else if (antiguedad > 10) {
            aumento = 0.30;
        }

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
            default:
                System.out.println("Categoría inválida");
                return;
        }

        double sueldoNeto = sueldoBruto + (sueldoBruto * aumento) + plus;

        System.out.println("Sueldo neto: " + sueldoNeto);
    }
}
