

public class ZIEL 
{
    RECHTECK stange;
    DREIECK fahne;

    
    public ZIEL()
    { 
        
        stange=new RECHTECK(0.25,4);
        fahne=new DREIECK(10.125,8.5,10.125,10,7,9);
        stange.setzeMittelpunkt(10,7.5);
        
    }

    
    
}