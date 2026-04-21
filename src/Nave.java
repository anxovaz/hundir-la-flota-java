public class Nave {
    /*
    Clase que define una nave
    +String nombre
    +String tipo
    +int tamanho

    métodos:
    +Constructor -> void
    +recibir_disparo -> booleano
    */
    public String nombre = "";
    public String tipo = "";
    public int tamanho = 0;
    public Nave(String nombre, String tipo, int tamanho){
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamanho = tamanho;


    }
    public boolean recibir_disparo(){
        this.tamanho -= 1;
        if(this.tamanho <= 0){
            return false; //a modo de error
        }else { //siempre debería devolver true
            return true;
        }
    }
}
