public class Casilla {
    /*
    *Clase que representa una casilla dentro del tablero
    * Esta clase tiene 2 constructores uno para "agua" y otro que acepta una nave

    * Atributos:
    - contenido: contiene o "agua" o una Nave
    - estado: Booleano que indica si ya se lanzó un ataque anteriormente o no.

    Métodos:
    -comprobar_contenido() -> Comprueba si hay agua o Nave y devuelve true o false
    -__init__ -> inizializador
    -setter y getter -> para Casilla.__contenido (@property y @contenido.setter)
    -recibirDisparo -> encargado de lanzar disparo a Nave
     */
     //por defecto agua
    Boolean estado = false; //no se ha visitado
    public Casilla(Nave nave) {
        Nave contenido = nave;
    }
    public Casilla(String agua){
        String contenido = "agua";
    }
}
