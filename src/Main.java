public class Main {
    /*
    *Clase para ejecutar el juego
     */
    public static void main(String[] args){
        Tablero tablero = new Tablero(); //instancia tablero 10x10
        Juego juego = new Juego();
        System.out.println(juego.lanzar_ataque(0,0));


    }
}
