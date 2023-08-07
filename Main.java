import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        Dealer dealer = new Dealer();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            dado1.setNum(0);
            dado2.setNum(0);
            dealer.ejTurnos(dealer.getTurno());
            dado1.tirarDado();
            System.out.println("Dado 1: "+ dado1.getNum());
            dado2.tirarDado();
            System.out.println("Dado 2: "+ dado2.getNum());
            if (dealer.getTurno() == 1) {
                if (dado1.getNum() == 1 || dado2.getNum() == 1){
                    System.out.println("Te ha salido un 1. Jugador 1 pierde sus puntos de la ronda.");
                    jugador1.setPuntajeRonda(0);
                    dealer.setTurno(2);             
                }
                else {
                    jugador1.sumarPuntajeRonda(dado1.getNum());
                    jugador1.sumarPuntajeRonda(dado2.getNum());
                    System.out.println("Puntaje de la ronda del jugador " + dealer.getTurno() + ": " + jugador1.getPuntajeRonda());
                    System.out.println("Puntaje total del jugador " + dealer.getTurno() + ": " + jugador1.getPuntaje());
                    if (jugador1.getPuntajeRonda() < 20) {
                        System.out.println();
                        System.out.println("¿Quieres tirar otra vez? \n 1: Sí \n 2: No");
                        int cambio = scanner.nextInt();
                        scanner.nextLine();
                        if (cambio == 2) {
                            dealer.setTurno(2);
                            jugador1.sumarPuntaje(jugador1.getPuntajeRonda());
                            jugador1.setPuntajeRonda(0);
                            if (jugador1.getPuntaje() >= 100) {
                                System.out.println("Jugador 1 gana");
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println();
                        System.out.println("Jugador 1 ya ganó el máximo de puntos en la ronda");
                        dealer.setTurno(2);
                        jugador1.sumarPuntaje(jugador1.getPuntajeRonda());
                        jugador1.setPuntajeRonda(0);
                    }
                }
            }
            else if (dealer.getTurno() == 2) {
                if (dado1.getNum() == 1 || dado2.getNum() == 1){
                    System.out.println("Te ha salido un 1. Jugador 2 pierde sus puntos de la ronda.");
                    jugador2.setPuntajeRonda(0);
                    dealer.setTurno(1);             
                }
                else {
                    jugador2.sumarPuntajeRonda(dado1.getNum());
                    jugador2.sumarPuntajeRonda(dado2.getNum());
                    System.out.println("Puntaje de la ronda del jugador " + dealer.getTurno() + ": " + jugador2.getPuntajeRonda());
                    System.out.println("Puntaje total del jugador " + dealer.getTurno() + ": " + jugador2.getPuntaje());
                    if (jugador2.getPuntajeRonda() < 20) {
                        System.out.println();
                        System.out.println("¿Quieres tirar otra vez? \n 1: Sí \n 2: No");
                        int cambio = scanner.nextInt();
                        scanner.nextLine();
                        if (cambio == 2) {
                            dealer.setTurno(1);
                            jugador2.sumarPuntaje(jugador2.getPuntajeRonda());
                            jugador2.setPuntajeRonda(0);
                            if (jugador2.getPuntaje() >= 100) {
                                System.out.println("Jugador 2 gana");
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println();
                        System.out.println("Jugador 2 ya ganó el máximo de puntos en la ronda");
                        dealer.setTurno(1);
                        jugador2.sumarPuntaje(jugador2.getPuntajeRonda());
                        jugador2.setPuntajeRonda(0);
                    }
                }
            }
            System.out.println("Presione Enter para continuar");
            scanner.nextLine();
        }
    }    
    
}