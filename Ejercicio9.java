public class Ejercicio9 {
    public static void main(String[] args) {
        int jugador1 = 1; // 0 = piedra, 1 = papel, 2 = tijera
        int jugador2 = 0;

        if (jugador1 == jugador2) {
            System.out.println("Empate");
        } else if ((jugador1 == 0 && jugador2 == 2) || (jugador1 == 1 && jugador2 == 0) || (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("Gana jugador 1");
        } else {
            System.out.println("Gana jugador 2");
        }
    }
}
