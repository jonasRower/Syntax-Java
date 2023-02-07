
public class Stack {
	
	int stck[] = new int[5];
	int tos;
	
	String Text;
	
	Stack(){
		tos = -1;
	}
	
	void push(int item)
	{
		if (tos == 4)
		{
			Text = "Zasobnik je plny";
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
	
	
	void push2(int item)
	{
		if (tos == 4)
		{
			Text = "Zasobnik je plny";
		}
		else
		{
			tos = tos + 1;
			stck[tos] = item;
		}
	}
	
	String pop2()
	{
		int tos2;
		if (tos < 0)
		{
			Text = "Zasobnik je jiz prazdny";
			return Text;
		}
		else
		{
			tos2 = tos;
			tos = tos - 1;
			return "" + stck[tos2];
		}
	}

}
