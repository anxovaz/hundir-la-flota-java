class Juego{
    Tablero tablero = new Tablero();

    public Juego(){
    }
    public String mostrar_resultado(int resultado) {
        if (resultado == 0) {
            return "Agua";
        } else if (resultado == 1) {
            return "Tocado";
        } else {
            return "Hundido";
        }
    }



}