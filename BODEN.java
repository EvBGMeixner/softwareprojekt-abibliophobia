

public class BODEN extends RECHTECK
{
    double deltaX;
    
    


    public BODEN(double x, double y)

    { 
        super(5,2);
        
        machePassiv();
        
        deltaX = 0;
        setzeMittelpunkt(x,y);
        setzeGroesse(2.5, 2);

        

        setzeGroesse(5, 2);

        setzeFarbe("grau");

        setzeMittelpunkt(x,y);

    }

    
}