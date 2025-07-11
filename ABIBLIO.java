
public class ABIBLIO extends SPIEL
{
    TEXT zier;
    Buch buch;
    Bibliothekarin spieler;
    
    BODEN [] hinderniss;

    BODEN boden;
    BODEN [] böden;
    ZIEL ziel1;
    
    public ABIBLIO()
    {   
        String zustandName ;
        String gifPfad ;
    
         zeigeKoordinatensystem(true);
        //buch=new Buch( "bu" , gifPfad);
        
        ziel1=new ZIEL();
        //zier=new TEXT("ZIEL ERREICHT");
        

        spieler=new Bibliothekarin("spieler.png");
        spieler.skaliere( 0.25 );
        böden=new BODEN[20];
        

        hinderniss = new BODEN[200];
        spieler.setzeMittelpunkt(-10,9);
        spieler.bewegen();

        
        böden=new BODEN [10];
        

        
        for (int i=0;i<50;i++){
            hinderniss[i]= new BODEN(-15+(i*4),-10);
        }

        //for ( int i=0; i<10; i++){
           // böden[i]= new BODEN(-13+(i*5),-7.5);
            //böden[i+1]= new BODEN(-13+(i*5),-7.5);
            //böden[i+2]= new BODEN(-13+(i*5),-7.5);
            
            
        //}
    
   
    
        
    


    }
    
    public int beispielMethode()
    {
        return 0;   
    }

    public void tasteReagieren (int taste) {
        if (istTasteGedrueckt(39)) {
            
            spieler.bewegeNachRechts();
            spieler.bewegen();
        }
        if (taste == 37) {
            spieler.bewegeNachLinks();
            spieler.bewegen();
        }
        if(taste == TASTE.RAUF){
            spieler.springe(12);
        }
    }

    public void tasteLosgelassenReagieren (int taste) {
        /*if (taste != 37 ||taste != 39) {
            spieler.anhalten();
            
        }*/
        
    }
    
    
    
    
    }

