
public class ABIBLIO extends SPIEL
{

    Buch buch;
    Bibliothekarin spieler;
    
    BODEN [] hinderniss;

    BODEN boden;
    BODEN [] böden;

    
    public ABIBLIO()
    {   
        String zustandName ;
        String gifPfad ;
    
         zeigeKoordinatensystem(true);
        //buch=new Buch( "bu" , gifPfad);

        spieler=new Bibliothekarin("bu" , gifPfad);
        böden=new BODEN[20];

        hinderniss = new BODEN[200];
        
        for (int i=0;i<50;i++){
            hinderniss[i]= new BODEN(-15+(i*4),-10);
        }

        for ( int i=0; i<10; i++){
            böden[i]= new BODEN(1,-7.5);
            böden[i+5]= new BODEN((1+i),-7.5);
            böden[i+10]= new BODEN((2+i),-7.5);
            
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
