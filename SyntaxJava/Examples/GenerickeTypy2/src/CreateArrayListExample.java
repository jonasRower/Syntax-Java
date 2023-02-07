import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

    public String VratText() {
    	
    	String text;
    	
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        text = "" + animals;
        
        return text;
        
    }
}