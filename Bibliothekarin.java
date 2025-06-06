

public class Bibliothekarin extends FIGUR
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    
    

    double deltaX;

  
    public  Bibliothekarin( String zustandName , String gifPfad )
    {
        super( zustandName , gifPfad );
        x = 0;
        deltaX = 0;
    }

    
    void bewegen() {
        verschiebenUm(deltaX, 0);
    }
    
    void bewegeNachLinks() {
        deltaX = -0.2;
    }
    
    void bewegeNachRechts() {
        deltaX = 0.2;
    }
    
    void anhalten() {
        deltaX = 0;
    }
    

    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
    
    
}
