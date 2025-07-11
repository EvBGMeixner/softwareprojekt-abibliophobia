
public class ABIBLIO extends SPIEL
{
    TEXT zier;
    Buch buch;
    Bibliothekarin spieler;
    
    BODEN [] hinderniss;

    BODEN boden;
    BODEN böden;
    ZIEL ziel1;
    
    public ABIBLIO()
    {   
        String zustandName ;
        String gifPfad ;
    
         zeigeKoordinatensystem(true);
        //buch=new Buch( "bu" , gifPfad);
        
        ziel1=new ZIEL("OIP-3762536241.png");
        ziel1.skaliere( 0.25 );
        ziel1.setzeMittelpunkt(10,7.1);
        
        //zier=new TEXT("ZIEL ERREICHT");
        

        spieler=new Bibliothekarin("spieler.png");
        spieler.skaliere( 0.25 );
        
        spieler.setzeMittelpunkt(-10,9);
        spieler.bewegen();

        
        hinderniss = new BODEN[200];
        //böden=new BODEN [10];
        
        böden= new BODEN(-15,-9.5,70,1);

        
        for (int i=0;i<3;i++){
           
           
           hinderniss[i]=new BODEN(-6+(i*7.5),-2.5+(i*4),5,1);
           
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

    /*public void tasteLosgelassenReagieren (int taste) {
        /*if (taste != 37 ||taste != 39) {
            spieler.anhalten();
            
        }*/
     
        
    }
    
    
    
    
    

