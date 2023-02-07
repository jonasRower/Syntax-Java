import java.util.ArrayList;
import java.util.List;

public class AnimalList {

	List<String> animals;
	
	public void NaplnAnimals() {
    
        // Naplni ArrayList
        animals = new ArrayList<>();

        // Prida elementy do ArrayListu
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

    }
    
    public String VratText() {
    	
    	String text;
    	
    	text = "Vystup se vypisuje z tridy AnimalList\n\n";
    	text = text + "Vrati vsechny polozky ArrayListu :\n";
    	text = text + animals + "\n\n";
    	text = text +"Vrati specifickou polozku ArrayListu :\n";
    	text = text + animals.get(1);
    	
    	return text;
    	
    }
}