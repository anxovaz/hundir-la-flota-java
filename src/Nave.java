/**
 * Clase Nave qque define un tipo de barco/nave
 *
 * @author Anxo Vázquez Lorenzo
 * @version 1.0
 */
public class Nave {
    /**
     * Nombre String nombre del barco
     * tipo String tipo del barco
     * tamanho int tamanho del barco, que también representa la vida
     */
    public String nombre = "";
    public String tipo = "";
    public int tamanho = 0;

    /**
     * Constructor que define atributos
     * @param nombre
     * @param tipo
     * @param tamanho
     */
    public Nave(String nombre, String tipo, int tamanho){
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamanho = tamanho;


    }

    /**
     * recibir_disparo recibe disparo y resta 1 a tamanho
     * @return
     */
    public boolean recibir_disparo(){
        this.tamanho -= 1;
        if(this.tamanho <= 0){
            return false; //a modo de error
        }else { //siempre debería devolver true
            return true;
        }
    }
}
