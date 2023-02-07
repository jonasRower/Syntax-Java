class Demo {
	
    String Text;
	
    public void NastavText()
	{
	   Text = "Je nastaven text";
	}
	
	public static String VratText()
	{
		//NastavText();  //nelze volat 
		return ("Nelze volat 'NastavText' ze statické metody");
	}
   
}
