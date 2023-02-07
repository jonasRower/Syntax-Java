

interface IntStack {
  void push(int item); 
  String pop();          
}


//class DynStackInterface {
class DynStackInterface implements IntStack {
	
	private int stck[];
	private int tos;
	
	String Text;
	
    // alokace a inicializace zasobniku
	DynStackInterface(int size)
	{
		stck = new int[size];
		tos = -1;
	}
	
	// pridani prvku do zasobniku
	public void push(int item) {
		if (tos == stck.length-1)
		{
			int temp[] = new int[stck.length * 2]; //zdvojnasobeni velikosti
			for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
			stck = temp;
			stck[++tos] = item;
		}
		else
		{
			stck[++tos] = item;
		}
	}
	
	//nacteni prvku ze zasobniku
	public String pop() {
		if(tos < 0)
		{
			Text = "Zasobnik je jiz prazdny";
			return Text;
		}
		else
		{
			return "" + stck[tos--];
		}
	}
}