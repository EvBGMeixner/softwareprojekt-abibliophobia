

public class ABIBLIO extends SPIEL
{
    Buch buch;
    SpeziellesBuch SpBuch;
    SuperBuch SuBuch;
    Bibliothekarin spieler;
    

    
    public ABIBLIO()
    { new RECHTECK(6,4);
        
    }

    
    
    public int beispielMethode()
    {
     return 0;   
    }
    
    public void tasteReagieren (int taste) {
        if (taste == 39) {
            spieler.bewegeNachLinks();
        }
        if (taste == 37) {
            spieler.bewegeNachRechts();
        }
    }
    public void tasteLosgelassenReagieren (int taste) {
        if (taste != 37) {
            spieler.anhalten();
        }
        if (taste != 39) {
            spieler.anhalten();
        }
    }
}
