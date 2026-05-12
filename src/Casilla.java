/**
 * Clase que representa una casilla dentro del tablero
 * Esta clase tiene 2 constructores uno para "agua" y otro que acepta una nave
 * @author Anxo Vázquez Lorenzo
 * @version 1.0
 */
public class Casilla {
    /**
     * Contenido contiene agua o una nave
     * Estado boleano que indica si ya se lanzo anteriormente un ataque
     */
    public Boolean estado = false; //no se ha visitado
    public Nave contenido;

    /**
     * Constructor para Naves
     * @param nave
     */
    public Casilla(Nave nave) {
        this.contenido = nave;
    }

    /**
     * Constructor para agua
     * @param agua
     */
    public Casilla(String agua){
        this.contenido = null;
    }

    /**
     * comprobar_contenido comprueba el contenido de la casilla
     * @return true/false
     */
    public boolean comprobar_contenido(){ //comprueba si es agua o nave
        if(this.contenido == null){
            return false;
        }else{
            return true;
        }
    }

    /**
     * RecibirDisparo clase que devuelve 0 en caso de agua, 1 en caso de nave, -1 en caso de que el usuario haya atacado dos o más veces a la misma casilla o -2 si está huundido
     * @return 0/1/-1/-2
     */
    public int recibirDisparo(){

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
