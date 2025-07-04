
public class ABIBLIO extends SPIEL
{
    
   
    Buch buch;
    SpeziellesBuch spezi;
    SuperBuch superb;
    Bibliothekarin spieler;
    
    BODEN [] hinderniss;
    
    String zustandName ;
    String gifPfad ;
    public ABIBLIO(){
         zeigeKoordinatensystem(true);
        //buch=new Buch( "bu" , gifPfad);
        
        hinderniss = new BODEN[200];
        
        for (int i=0;i<50;i++){
            hinderniss[i]= new BODEN(-15+(i*4),-10);
        }
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
