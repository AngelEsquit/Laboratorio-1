public class Dealer {
    private int turno = 1;


    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void ejTurnos(int n) {
            if (n == 1) {
                System.out.println();
                System.out.println();
                System.out.println("--------------------");
                System.out.println("Turno del jugador 1");
                System.out.println("--------------------");
                System.out.println();
            }
            else if (n == 2){
                System.out.println();
                System.out.println();
                System.out.println("--------------------");
                System.out.println("Turno del jugador 2");
                System.out.println("--------------------");
                System.out.println();
            }
    }
}
