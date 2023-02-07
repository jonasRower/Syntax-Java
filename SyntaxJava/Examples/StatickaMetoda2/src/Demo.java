class Demo {
	
    static String Text;
	
    public static void NastavText()
	{
	   Text = "Je nastaven text\n\nPromenna musi byt staticka,\nprotoze je volana statickou metodou";
	}
	
	public static String VratText()
	{
		NastavText();  //lze volat pouze statickou metodu
		return (Text);
	}
   
}
