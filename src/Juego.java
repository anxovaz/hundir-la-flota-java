/**
 * Clase Juego que actua como interfaz.
 *
 * @author Anxo Vázquez Lorenzo
 * @version 1.0
 */
class Juego{
    /**
     * Instancia un tablero
     */
    Tablero tablero = new Tablero();

    /**
     * Constructor
     */
    public Juego(){
    }

    /**
     * lanzar_ataque recibe x e y para ñanzar un ataque a la casilla del tablero
     * @param x
     * @param y
     * @return String
     */
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