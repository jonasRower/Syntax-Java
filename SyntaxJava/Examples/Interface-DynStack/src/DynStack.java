
public class DynStack {
	
	int stck[];
	int tos;
	
	String Text;
	
	DynStack(int size){
		
		stck = new int[size];
		tos = -1;
	}
	
	void push(int item)
	{
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
	
	String pop()
	{
		if (tos < 0)
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
