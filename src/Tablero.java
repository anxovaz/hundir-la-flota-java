public class Tablero {
    public static final int AGUA = 0;
    public static final int TOCADO = 1;
    public static final int HUNDIDO = 2;

    public Casilla[][] tablero;
    public Tablero() {

         //inicializacion de las naves
        Nave por1 = new Nave("Enterprise", "portaaviones", 5);

        Nave fra1 = new Nave("Bismarck", "fragata", 3);
        Nave fra2 = new Nave("Prince of Wales", "fragata", 3);
        Nave fra3 = new Nave("Graf Spee", "fragata", 3);

        Nave sub1 = new Nave("U-47", "submarino", 1);
        Nave sub2 = new Nave("U-96", "submarino", 1);
        Nave sub3 = new Nave("U-505", "submarino", 1);
        Nave sub4 = new Nave("U-534", "submarino", 1);


        //generar casillas
        Casilla casilla01 = new Casilla(por1);
        Casilla casilla11 = new Casilla(fra1);
        Casilla casilla12 = new Casilla(fra2);
        Casilla casilla13 = new Casilla(fra3);
        Casilla casilla21 = new Casilla(sub1);
        Casilla casilla22 = new Casilla(sub2);
        Casilla casilla23 = new Casilla(sub3);
        Casilla casilla24 = new Casilla(sub4);


        this.tablero = new Casilla[][]{
                {new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua")},
                {new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua")},
                {new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua")},
                {new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua")},
                {new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua")},
                {new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua")},
                {new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua")},
                {new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua")},
                {new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua")},
                {new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua"), new Casilla("agua")}
        };
        this.tablero[0][0]=casilla01;
        this.tablero[6][1]=casilla11;
        this.tablero[6][2]=casilla12;
        this.tablero[6][3]=casilla13;
        this.tablero[2][5]=casilla21;
        this.tablero[2][6]=casilla22;
        this.tablero[2][7]=casilla23;
        this.tablero[2][8]=casilla24;
    }



}
