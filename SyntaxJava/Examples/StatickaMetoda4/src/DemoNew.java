class DemoNew {
	
    static String Text; // mozno pouze static, protoze je vraceno statickou metodou
	
    public void NastavText()
	{
	   Text = "Nestatickou metodu ze staticke\nje mozne volat jen po inicializaci";
	}
	
	public static String VratText()
	{
		DemoNew obj = new DemoNew();
		obj.NastavText(); 
		return (Text);
	}
   
}
