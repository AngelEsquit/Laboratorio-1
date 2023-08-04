public class Main {
    
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        Dealer dealer = new Dealer();

        while (true) {
            System.out.println("Inicia jugador 1.");
            dado1.setNum();
            System.out.println(dado1.getNum());
            dado2.setNum();
            System.out.println(dado2.getNum());
            jugador1.setPuntaje(dado1.getNum());
            jugador1.setPuntaje(dado2.getNum());
            System.out.println(jugador1.getPuntaje());
            break;
        }

    }
}
