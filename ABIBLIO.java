
public class ABIBLIO extends SPIEL
{
    /**ist jetzt hier unser sogenanntes lvl 1(gibt auch kein zweites)**/

    TEXT zier;
    Buch buch;
    Bibliothekarin spieler;

    boolean ZielErreicht;

    BODEN [] hinderniss;

    BODEN boden;
    BODEN böden;
    ZIEL ziel1;

    public ABIBLIO()
    {   
        //zeigeKoordinatensystem(true);
        boolean ZielErreicht=false;
        ziel1=new ZIEL("OIP-3762536241.png");
        ziel1.skaliere( 0.20 );
        ziel1.setzeMittelpunkt(10,6.1);

        spieler=new Bibliothekarin("spieler.png");
        spieler.skaliere( 0.20);

        spieler.setzeMittelpunkt(-10,9);
        spieler.bewegen();

        hinderniss = new BODEN[200];
        böden= new BODEN(-15,-9.5,70,1);

        for (int i=0;i<3;i++){

            hinderniss[i]=new BODEN(-6+(i*7.5),-3.5+(i*4),5,1);
        }
        

    }

    @Override
    public void tasteLosgelassenReagieren(int taste) 
    {
        if(taste == 37||taste == 39){
         spieler.deltaX = 0;
        }
    }

    public void tasteReagieren (int taste) {
        
        if(ZielErreicht==false){
            if(taste == 37){

                spieler.bewegeNachLinks();
            }if(taste == 39){

                spieler.bewegeNachRechts();
            }if (taste == 38){

                spieler.springe(12);
            }
        }
        if(spieler.beruehrt(ziel1)){

            zier=new TEXT(0 , 0 , 3 ,"ZIEL ERREICHT");
            zier.setzeFarbe( "rot" );
            ZielErreicht=true;
        }

    } 

    public void bildAktualisierungReagieren(double sekunden) {
        if (ZielErreicht=false){
            spieler.bewegen();
        }
        if(istTasteGedrueckt(39)){

            spieler.verschiebenUm(0.1,0);
        }
        if(istTasteGedrueckt(37)){

            spieler.verschiebenUm(-0.1,0);
        }
        
            /*if(istTasteGedrueckt(38)){

            spieler.springe(4);
        }*/

        
    }

    /**hab jetzt größtenteils alles alleine gemacht(Miriam)
     * Anna kann da eigentlch nichts für, wegen Umständen
     * wollte es nur mal gesagt haben
     * (sie brauhćht aber die note)
     **/  

}

    
