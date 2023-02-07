import java.util.ArrayList;


public class novaTrida {
	
	
	String ArrayList()
	{
		String Text;
		Text = "Bez konverze\n\n";
		
		// create a ArrayList String type 
        ArrayList<Integer> al = new ArrayList<Integer>(); 
  
        // Initialize an ArrayList with add() 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(40);
  
        // print ArrayList 
        Text = Text + al;
		
		
		return Text;
	
	}
	
	
	String ArrayListConvertToArray()
	{
		String Text;
		Text = "Convert to Array\n\n";
		
		ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(40); 
  
        Object[] objects = al.toArray(); 
  
        // Printing array of objects 
        for (Object obj : objects) 
        	Text = Text + obj + "\n"; 
		
		return Text;
	}
	
}
