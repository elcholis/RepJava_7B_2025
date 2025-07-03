public class Ejercicio13 {
    public static void main(String[] args) {
        String mes = "abril"; // Cambiar por el mes deseado (en minúsculas)
        int dias;

        switch (mes) {
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            case "febrero":
                dias = 28;
                break;
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            default:
                dias = 0; // Mes inválido
        }

        if (dias == 0) {
            System.out.println("Mes inválido");
        } else {
            System.out.println("El mes de " + mes + " tiene " + dias + " días.");
        }
    }
}
