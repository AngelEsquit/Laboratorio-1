public class Jugador {
    private int seguir;
    private int puntaje;

    public void setSeguir(int seguir) {
        this.seguir = seguir;
    }

    public int getSeguir() {
        return seguir;
    }

    public void setPuntaje(int puntos) {
        this.puntaje = puntaje + puntos;
    }

    public int getPuntaje() {
        return puntaje;
    }
}
