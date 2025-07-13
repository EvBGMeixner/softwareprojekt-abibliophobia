
public class ABIBLIO extends SPIEL
{
    /**ist jetzt hier unser sogenanntes lvl 1(gibt auch kein zweites)**/
    
    TEXT zier;
    Buch buch;
    Bibliothekarin spieler;
    
    BODEN [] hinderniss;

    BODEN boden;
    BODEN böden;
    ZIEL ziel1;
    
    public ABIBLIO()
    {   
        zeigeKoordinatensystem(true);
        
        ziel1=new ZIEL("OIP-3762536241.png");
        ziel1.skaliere( 0.25 );
        ziel1.setzeMittelpunkt(10,6.1);

        spieler=new Bibliothekarin("spieler.png");
        spieler.skaliere( 0.25 );
        
        spieler.setzeMittelpunkt(-10,9);
        spieler.bewegen();
        
        hinderniss = new BODEN[200];
        böden= new BODEN(-15,-9.5,70,1);

        for (int i=0;i<3;i++){
           
           
           hinderniss[i]=new BODEN(-6+(i*7.5),-3.5+(i*4),5,1);
           
        }

        if(spieler.beruehrt( ziel1)=true){
            
            zier=new TEXT(-5 , 0 , 3 ,"ZIEL ERREICHT");
            zier.setzeFarbe( "rot" );
        }
        
        
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
     
    /**hab jetzt größtenteils alles alleine gemacht(Miriam)
       * Anna kann da eigentlch nichts für, wegen Umständen
       * wollte es nur mal gesagt haben
       * 
       * Ich versteh auch nict warum der code für den text nicht funktioniert
       * aber ist halt jetzt so
       * deswegen halt kein definiertes ende
       * bin jetzt fertig(13/07/2025-23:30)
       * (soweit man das sagen kann(das mit dem zieltext funktioniert immer noch nicht))
       * (ich versteh das nicht, es ergibt alles keinen sinn)
       **/  
      
    }
    
    
    
    
    

