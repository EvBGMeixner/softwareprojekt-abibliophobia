
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

    /**
     * Konstruktor für Objekte der Klasse Bibliothekarin
     */
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

}
