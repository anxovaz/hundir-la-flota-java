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
    -recibirDisparo -> encargado de lanzar disparo a Nave
     */
     //por defecto agua
    public Boolean estado = false; //no se ha visitado
    public Nave contenido;
    public Casilla(Nave nave) {
        this.contenido = nave;
    }
    public Casilla(String agua){
        this.contenido = null;
    }

    public boolean comprobar_contenido(){ //comprueba si es agua o nave
        if(this.contenido == null){
            return false;
        }else{
            return true;
        }
    }
    public int recibirDisparo(){
        /*
        recibirDisparo devuelve:
        0 en caso de agua
        1 en caso de nave
        -1 en caso de que el usuario haya atacado dos o más veces a la misma casilla y
        2  si está hundido
         */

        if(this.estado == false){//si no se le ha disparado antes
            this.estado = true;
            if(comprobar_contenido() == true){//si contiene una nave
                this.contenido.recibir_disparo(); //se lanza un disparo
                if(this.contenido.tamanho <= 0){ //si no tiene vidas
                    return 2;
                }else{ //tiene vidas
                    return 1;
                }

            }else { //agua
                return 0;

            }
            }else{
            return -1;
        }
    }

}
