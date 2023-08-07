public class Jugador {
    private int seguir;
    private int puntaje;
    private int puntajeRonda;

    public void setSeguir(int seguir) {
        this.seguir = seguir;
    }

    public int getSeguir() {
        return seguir;
    }

    public void setPuntaje(int puntos) {
        this.puntaje = puntos;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntajeRonda(int puntajeRonda) {
        this.puntajeRonda = puntajeRonda;
    }

    public int getPuntajeRonda() {
        return puntajeRonda;
    }

    public void sumarPuntajeRonda(int valor) {
        this.puntajeRonda += valor;
    }

    public void sumarPuntaje(int valor) {
        this.puntaje += valor;
    }
}
