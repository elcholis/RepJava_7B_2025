public class Ejercicio1 {
    public static void main(String[] args) {
        int nota1 = 8, nota2 = 6, nota3 = 7;
        double promedio = (nota1 + nota2 + nota3) / 3.0;

        if (promedio >= 7)
            System.out.println("Aprobado");
        else
            System.out.println("Reprobado");
    }
}
