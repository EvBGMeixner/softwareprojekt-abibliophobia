

public class Bibliothekarin extends FIGUR
{
    double deltaX;
    
  
    public  Bibliothekarin(String gifPfad )
    {
        super("spieler.png");
        
        deltaX = 0;
        macheAktiv();
    }
        
    public boolean beruehrt( FIGUR ea ) 
    {
        return super.schneidet( ea );
    }
    
    public boolean beinhaltetPunkt( double x , double y ) 
    {
        return super.beinhaltetPunkt( x , y );
    }
    
    void bewegen() {
        verschiebenUm(deltaX, 0);
    }
    
    void bewegeNachLinks() {
        deltaX = -2;
    }
    
    void bewegeNachRechts() {
        deltaX = 02;
    }
    
    void anhalten() {
        deltaX = 0;
    }

    
    
    
}

