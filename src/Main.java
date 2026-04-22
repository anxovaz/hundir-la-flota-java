public class Main {
    /*
    *Clase para ejecutar el juego
     */
    public static void main(String[] args){
        Tablero tablero = new Tablero(); //instancia tablero 10x10
        Juego juego = new Juego();
        System.out.println(juego.lanzar_ataque(0,0));
        System.out.println(juego.lanzar_ataque(1, 2));
        System.out.println(juego.lanzar_ataque(1, 3));
        System.out.println(juego.lanzar_ataque(2,8));
        System.out.println(juego.lanzar_ataque(1,5));

        //prueba del mét0do colocar_nave() --> pendiente arreglar
        System.out.println("---");
        System.out.println(juego.lanzar_ataque(6,4));
        Nave nave1 = new Nave("test nave", "submarino", 1);
        juego.tablero.colocar_nave(nave1,6,4);
        System.out.println(juego.lanzar_ataque(6,4));

    }
}
