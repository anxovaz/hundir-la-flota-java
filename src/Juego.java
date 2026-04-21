class Juego{
    Tablero tablero = new Tablero();

    public Juego(){
    }

    public String lanzar_ataque(int x, int y){
        System.out.println("Atacando a " + x + "," + y);
        int resultado = this.tablero.comprobar_impacto(x,y);
        if (resultado == 0) {
            return "Agua";
        } else if (resultado == 1) {
            return "Tocado";
        } else {
            return "Hundido";
        }
    }



}