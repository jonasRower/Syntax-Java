class Demo {
	
    static String Text;  //musi byt staticka, protoze je vracena statickou metodou
	
    public static void NastavText()
	{
	   Text = "Bez inicializace je mozne\nvolat pouze staticke metody";
	}
	
	public static String VratText()
	{
		//bez inicializace lze volat pouze statickou metodu
		NastavText();  
		return (Text);
	}
   
}
