
/**
 * Beschreiben Sie hier die Klasse Bibliothekarin.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bibliothekarin extends FIGUR
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    double deltaX; 
    
    
    public  Bibliothekarin( String zustandName , String gifPfad )
    {
        super( zustandName , gifPfad );
        x = 0;
    }

    
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
    
    void bewegeNachLinks() {
        deltaX = -0.4;
    }
    
    void bewegeNachRechts() {
        deltaX = 0.4;
    }
}
