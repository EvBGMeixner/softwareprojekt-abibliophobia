

public class ZIEL
{
    RECHTECK stange;
    DREIECK fahne;

    
    public ZIEL()
    { 
        
        stange=new RECHTECK(0.25,4);
        fahne=new DREIECK(10.125,-7.5,10.125,-5,7,-6);
        stange.setzeMittelpunkt(10,-7.5);
        
    }

    
    
}