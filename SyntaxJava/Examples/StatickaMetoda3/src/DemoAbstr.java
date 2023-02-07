class DemoAbstr extends AbstractDemo{
	
    static String Text;
	
    public void NastavText()
	{
	   Text = "Je nastaven text\n\nMetoda nastavujici Text\nNeni staticka - je odvozena od abstraktni";
	}
	
	public static String VratText()
	{
		AbstractDemo obj = new DemoAbstr();
		obj.NastavText(); 
		return (Text);
	}
   
}
