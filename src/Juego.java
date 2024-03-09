import java.util.Random;
import java.util.Scanner;

public class Juego {
    public void jugar() {
        System.out.println("Jueguemos a piedra papel o tijera");
        System.out.println("Escribe alguno de estos : Piedra, Papel o Tijera");

        //Pedirle al usuario que escoja.
        Scanner teclado = new Scanner(System.in);
        String respuestaDelUsuario = teclado.nextLine();

        String respuestaDeLaComputadora = elegirOpcionAleatoria();

        System.out.println("La computadora escogio: " + respuestaDeLaComputadora);


        decidirQuienGano(respuestaDelUsuario, respuestaDeLaComputadora);


    }

    private void decidirQuienGano(String respuestaDelUsuario, String respuestaDeLaComputadora) {
        if (respuestaDelUsuario.equals(respuestaDeLaComputadora)) {
            System.out.println("Empate!");
        } else if (respuestaDelUsuario.equalsIgnoreCase("Piedra") && respuestaDeLaComputadora.equalsIgnoreCase("Tijera")) {
            System.out.println("Ganaste!");
        } else if (respuestaDelUsuario.equalsIgnoreCase("Papel") && respuestaDeLaComputadora.equalsIgnoreCase("Piedra")) {
            System.out.println("Ganaste!");
        } else if (respuestaDelUsuario.equalsIgnoreCase("Tijera") && respuestaDeLaComputadora.equalsIgnoreCase("Papel")) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
        }
    }

    private String elegirOpcionAleatoria() {
        String respuestaDeLaComputadora = "";
        Random generadorNumAleatorios = new Random();
        int numAleatorio = generadorNumAleatorios.nextInt(3);
        if (numAleatorio == 0) {
            respuestaDeLaComputadora = "Piedra";
        }
        if (numAleatorio == 1) {
            respuestaDeLaComputadora = "Papel";
        }
        if (numAleatorio == 2) {
            respuestaDeLaComputadora = "Tijera";
        }
        return respuestaDeLaComputadora;
    }
}