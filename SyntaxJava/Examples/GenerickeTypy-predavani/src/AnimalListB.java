import java.util.ArrayList;
import java.util.List;

public class AnimalListB {

	List<String> animals;
	
    //public void NaplnAnimals() {
    public ArrayList<String> NaplnAnimals() {
    
        // Naplni ArrayList
        animals = new ArrayList<>();

        // Prida elementy do ArrayListu
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        
        return (ArrayList<String>) animals;

    }
    

}