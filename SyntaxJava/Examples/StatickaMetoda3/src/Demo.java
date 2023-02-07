class Demo {
	
    static String Text;  //musi byt staticka
	
    public static void NastavText()
	{
	   Text = "Je nastaven text\n\nMetoda nastavujici Text\nJe staticka";
	}
	
	public static String VratText()
	{
		NastavText();  
		return (Text);
	}
   
}
