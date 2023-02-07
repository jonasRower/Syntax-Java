class Demo {
	
	   //Static integer variable
	   static String var1 = "Staticka promenna"; 
	   //non-static string variable
	   String var2;
	
	
	   public static String hlavni()
	   {
			Demo ob1 = new Demo();
			Demo ob2 = new Demo();
			
			String text;
			text = "";

			ob1.var1 = "Prepisuji statickou promennou v obj1";
			ob1.var2 = "Prepisuji promennou v obj1";

		    ob2.var1 = "Prepisuji statickou promennou v obj2";
			ob2.var2 = "Prepisuji promennou v obj2";
			
			text = text + ob1.var1 + "\n";
			text = text + ob1.var2 + "\n";
			
			text = text + ob2.var1 + "\n";
			text = text + ob2.var2 + "\n";
			
			return text;
			
	   }
}
