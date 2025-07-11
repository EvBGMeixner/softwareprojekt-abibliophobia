

public class Bibliothekarin extends FIGUR
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    double deltaX;
    
  
    public  Bibliothekarin(String gifPfad )
    {
        super(gifPfad);
        x = 0;
        deltaX = 0;
        macheAktiv();
        
        
    }
    
    public  boolean stehtAuf(ziel1);
        
    
    
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

    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
    
    //aktivMachen() {
        
    //}
    // void getImage() {
        
    //}
}
