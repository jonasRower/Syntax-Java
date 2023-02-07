
public class novaTrida {
	
	String Text;
	
	public void NastavText()
	{
		Text = "Je nastaven text";
	}
	
	public String VratText()
	{
		NastavText();
		return Text;
	}

}
