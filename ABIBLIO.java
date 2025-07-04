
public class ABIBLIO extends SPIEL
{

    Buch buch;
    SpeziellesBuch spezi;
    SuperBuch superb;
    Bibliothekarin spieler;
    BODEN boden;
    
    public ABIBLIO()
    {   new RECHTECK(6,4);
        String zustandName ;
        String gifPfad ;
    
         zeigeKoordinatensystem(true);
        //buch=new Buch( "bu" , gifPfad);
        //spezi=new SpeziellesBuch("spbu", gifPfad);
        //superb=new SuperBuch("subu", gifPfad);
        boden=new BODEN();
    
    
   
    
    
    

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
