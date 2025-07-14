public class Buch extends FIGUR

{
    //höhe: 1.5,2
    boolean aufgesammelt;

    public Buch( String gifPfad, double x, double y){
        super(gifPfad);
        skaliere( 0.10 );
        setzeMittelpunkt( x, y);
        //machePassiv();
        aufgesammelt=false;
    }

}

