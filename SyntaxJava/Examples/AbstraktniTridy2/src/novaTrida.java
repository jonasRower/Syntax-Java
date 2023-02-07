
import java.util.ArrayList;


public class novaTrida {
	
    String VratText()
    {
        String Text;
        Text = "";

        MujObjekt StavajiciObjekt;              
        LinkedList<MujObjekt> Objekty = new LinkedList<MujObjekt>();

        StavajiciObjekt = new MujObjekt("Prvni Objekt");
        Objekty.pridejNaZacatek(StavajiciObjekt); 
        
        StavajiciObjekt = new MujObjekt("Druhy Objekt");
        Objekty.pridejNaZacatek(StavajiciObjekt); 
        
        StavajiciObjekt = new MujObjekt("Treti Objekt");
        Objekty.pridejNaZacatek(StavajiciObjekt); 
        
        
        //Ziska a Vytiskne hodnoty z pole objektu
        ArrayList<MujObjekt> shapeArray = Objekty.vratPole();
        for ( int counter=shapeArray.size()-1; counter>=0; counter-- )
        {       
            Text = Text + shapeArray.get(counter).promenna + "\n";
        }
        
        return Text;
    }

}
