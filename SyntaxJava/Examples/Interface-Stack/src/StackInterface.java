

interface IntStack {
  void push(int item); 
  String pop();          
}

//pokud zakomentuju interface IntStack a zrusim implements IntStack
//pak se chova stejne

class StackInterface implements IntStack {

	private int stck[];
	private int tos;
	
	String Text;
	
    // alokace a inicializace zasobniku
	StackInterface(int size)
	{
		stck = new int[size];
		tos = -1;
	}
	
	// pridani prvku do zasobniku
	public void push(int item) {
		if (tos == stck.length-1)
		{
			Text = "Zasobnik je plny";
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