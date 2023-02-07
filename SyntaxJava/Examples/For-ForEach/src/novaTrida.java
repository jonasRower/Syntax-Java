
public class novaTrida {
	
	
	String ForCyklus()
	{
		String Text;
		Text = "For Cyklus\n\n";
		
		String[] jmena = new String[] {"Karel", "Pepa", "Michal", "Vojta"};

		for (int i = 0; i < jmena.length; i++) {
			Text = Text + jmena[i] + "\n";
		}
		
		return Text;
	}
	
	String ForEachCyklus()
	{
		String Text;
		Text = "ForEach Cyklus\n\n";
		
		String[] jmena = new String[] {"Karel", "Pepa", "Michal", "Vojta"};

		for (String jmeno: jmena) {
			Text = Text + jmeno + "\n";
		}
		
		
		return Text;
	
	}
}
