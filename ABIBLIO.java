
public class ABIBLIO extends SPIEL
{
    /**ist jetzt hier unser sogenanntes lvl 1(gibt auch kein zweites)**/
    boolean fertig = false;
    int gesammelteBücher;
    TEXT zier;
    TEXT anzeigeBücher;
    TEXT score;
    
    Buch buch;
    Buch buch1;
    Buch buch2;
    Buch buch3;
    Buch buch4;
    
    Bibliothekarin spieler;

    boolean ZielErreicht;

    BODEN [] hinderniss;

    BODEN boden;
    BODEN böden;
    ZIEL ziel1;

    public ABIBLIO()
    {   
        
        zeigeKoordinatensystem(true);
        boolean ZielErreicht=false;
        
        
        
        ziel1=new ZIEL("OIP-3762536241.png");
        ziel1.skaliere( 0.20 );
        ziel1.setzeMittelpunkt(10,6.1);

        spieler=new Bibliothekarin("spieler.png");
        spieler.skaliere( 0.20);
        spieler.setzeMittelpunkt(-10,-7.5);
        spieler.bewegen();
        
        buch=new Buch( "Buch.png",5,-5);
        buch1=new Buch( "Buch.png",-5,5);
        buch2=new Buch( "Buch.png",2.5,7.5);
        buch3=new Buch( "Buch.png",-10,2.5);
        buch4=new Buch( "Buch.png",10,-0);
        
        
        anzeigeBücher=new TEXT(-11 ,9 , 1 ,"BÜCHER:"+ gesammelteBücher);
        gesammelteBücher=0;
        

        hinderniss = new BODEN[200];
        böden= new BODEN(-15,-9.5,70,1);

        for (int i=0;i<3;i++){

            hinderniss[i]=new BODEN(-6+(i*7.5),-3.5+(i*4),5,1);
        }
        
        fertig=true;
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
        

    } 

    @Override
    public void bildAktualisierungReagieren(double sekunden) {
        if (!fertig) {
            return;
        }
        
        if (ZielErreicht=false){
            spieler.bewegen();
        }
        if(istTasteGedrueckt(39)){

            spieler.verschiebenUm(0.1,0);
        }
        if(istTasteGedrueckt(37)){

            spieler.verschiebenUm(-0.1,0);
        }
        
         if(spieler.beruehrt(buch) && buch.istSichtbar() ) {
                buch.setzeSichtbar(false);
                buch.aufgesammelt = true;
                buch.entfernen();
                buchSammeln();
            } 
        if(spieler.beruehrt(buch1) && buch1.istSichtbar() ) {
                buch1.setzeSichtbar(false);
                buch1.aufgesammelt = true;
                buch1.entfernen();
                buchSammeln();
            } 
        if(spieler.beruehrt(buch2) && buch2.istSichtbar() ) {
                buch2.setzeSichtbar(false);
                buch2.aufgesammelt = true;
                buch2.entfernen();
                buchSammeln();
            } 
        if(spieler.beruehrt(buch3) && buch3.istSichtbar()) {
                buch3.setzeSichtbar(false);
                buch3.aufgesammelt = true;
                buch3.entfernen();
                buchSammeln();
            } 
        if(spieler.beruehrt(buch4) && buch4.istSichtbar())  {
                buch4.setzeSichtbar(false);
                buch4.entfernen();
                buch4.aufgesammelt = true;
                buchSammeln();
            } 
        
        if(spieler.beruehrt(ziel1)){
           zier=new TEXT(0,0,3,"ZIEL ERREICHT");
           zier.setzeFarbe("rot");  
           score=new TEXT(0,-3,3,"BÜCHER:"+gesammelteBücher);
        }
        
    }
    
    void buchSammeln(){
        gesammelteBücher++;
        anzeigeBücher.setzeInhalt("BÜCHER:"+gesammelteBücher);
    }
    
    

}

    
