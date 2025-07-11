

public class BODEN extends RECHTECK
{
    double deltaX;
    
    


    public BODEN(double x, double y, double x1, double y1)

    { 
        //super(5,2);
        
        machePassiv();
        
        deltaX = 0;
        setzeMittelpunkt(x,y);
        setzeGroesse(x1, y1);

        

        //setzeGroesse(5, 2);

        setzeFarbe("grau");

        setzeMittelpunkt(x,y);
        machePassiv();

    }

    
}