
public class ABIBLIO extends SPIEL
{
<<<<<<< HEAD
    Buch buch;
    SpeziellesBuch SpBuch;
    SuperBuch SuBuch;
    Bibliothekarin spieler;
    

=======
>>>>>>> 6385d7e71354fbee686aeab09aa67e27979ea7f2
    
<<<<<<< HEAD
    public ABIBLIO()
    { new RECHTECK(6,4);
=======
   
    Buch buch;
    SpeziellesBuch spezi;
    SuperBuch superb;
    Bibliothekarin spieler;
    BODEN boden;
    
    String zustandName ;
    String gifPfad ;
    public ABIBLIO(){
         zeigeKoordinatensystem(true);
        //buch=new Buch( "bu" , gifPfad);
        //spezi=new SpeziellesBuch("spbu", gifPfad);
        //superb=new SuperBuch("subu", gifPfad);
        boden=new BODEN();
>>>>>>> 6385d7e71354fbee686aeab09aa67e27979ea7f2
        
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
