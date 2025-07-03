public class Ejercicio3 {
    public static void main(String[] args) {
        String mes = "febrero"; // Cambiar por el mes deseado (en minúsculas)
        int dias;

        if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            dias = 30;
        } else if (mes.equals("febrero")) {
            dias = 28;
        } else {
            dias = 31;
        }

        System.out.println("El mes de " + mes + " tiene " + dias + " días.");
    }
}
